package ecommerce;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

//class Alltests{
//	public String searchproduct(String product) {
//		String [] allproduct= {"phone","watches","earphone"};
//		for(String p:allproduct) {
//			if(p==product) {
//				return p;
//			}
//		}
//		return "";
//	}
//	  public String testSearchProductFoundbyorderno(Integer orderno) {
//	        Map<Integer, String> orderMap = new HashMap<>();
//	        orderMap.put(1, "phone");
//	        orderMap.put(2, "watches");
//	        orderMap.put(3, "earphone"); 	 
//	        	 for (Integer key : orderMap.keySet()) {
//	                 String value = orderMap.get(key);
//	                 if(key==orderno) {
//	                	 return value;
//	                 }
//	             }
//	        	 return "";
//	  }
//};


public class kaushik {
	
	public static double test(String pin, String accountNo) {
        // Simulate a database with account information
        Map<String, Map<String, Object>> accounts = new HashMap<>();
        accounts.put("1234567890", new HashMap<String, Object>() {{
            put("pin", "1234");
            put("balance", 1000.0);
        }});
        accounts.put("9876543210", new HashMap<String, Object>() {{
            put("pin", "5678");
            put("balance", 500.0);
        }});

        if (accounts.containsKey(accountNo)) {
            // Account exists, return its balance
            double balance = (double) accounts.get(accountNo).get("balance");
            return balance;
        } else {
            return 0;
        }
    }


	
	@Test
	public void testAccountBalance() {
        String inputPin = "1234";
        String inputAccount = "1234567890";
        double expectedBalance = 1000.0;
        
        double actualBalance = test(inputPin, inputAccount);
        assertEquals(expectedBalance, actualBalance, 0.001);
    }

	
	
}
