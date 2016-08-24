package nsconnector.actions;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class HelperTest {

	@Test
	public void evaluateExpression(){
		Helpers helpers = new Helpers();
		String dateStr = "2016-08-19'T'12:00:00'Z'";
		Date date = helpers.convertStringToDate(dateStr);
		String dateEval = helpers.convertDateToString(date);
		assertEquals(dateStr, dateEval);
		
		
	}
	
}
