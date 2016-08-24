package nsconnector.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

import com.mendix.core.Core;

public final class HttpRequest {
	
	//Input string for HTTP request
	//Returns String with requestbody
	//Throws IOException if request fails
	static String httpGet(String urlStr, String apiEmail, String apiKey) throws IOException{
		URL url = new URL(urlStr);
		
		//Set Authentication Encoding
		String authStr = apiEmail + ":" + apiKey;
		
		String encoded = new String(Base64.encodeBase64(authStr.getBytes()));
		encoded = encoded.replaceAll("\\s+", "");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestProperty("Authorization", "Basic " + encoded);

		//If the HTTP request does not return a HTTP header code 200 -> throw exception with responsemessage
		if(connection.getResponseCode() != 200){
			Core.getLogger("callNSApi").error(connection.getResponseCode());
			throw new IOException(connection.getResponseMessage());
		}
				
		//Buffer the result into a string
		BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		StringBuilder resultStringb = new StringBuilder();
		String line;

		//If the new line of the buffer is not empty append to resultStringb
		while((line = buffer.readLine()) != null){
			resultStringb.append(line);
		}
		
		//When done, close the buffer and disconnect the HTTP connection
		buffer.close();
		connection.disconnect();
		
		return resultStringb.toString();
	}
}
