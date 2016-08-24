package nsconnector.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class Helpers {
	//Methods that gets the child elemement of the parent element
	//input parent element & childname
	//output textual context of child element
	static String getChildElementContent(Element e, String childName){
		NodeList children = e.getElementsByTagName(childName);
		
		if(children.getLength() > 0){
			
			return children.item(0).getTextContent();
		}
		return "";
	}
	
	//Convert strings with date to the correct date format
	//Input: String containing datetime in format: YYYY-MM-DDThh:mm:ssTZD
	//Output: Date object
	static Date convertStringToDate(String s){
		
		DateTime dateTime = ISODateTimeFormat.dateTimeParser().parseDateTime(s);
		
		return dateTime.toDate();
	}
	
	//Converts a date object to a ISO 8601 date format in a string to be used in requests
	//Input: Date object
	//Output: String
	static String convertDateToString(Date date){
		
		TimeZone z = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		df.setTimeZone(z);
		
		return df.format(date);
		
	}
}
