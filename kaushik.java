package ecommerce;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

class Alltests{
	public String searchproduct(String product) {
		String [] allproduct= {"phone","watches","earphone"};
		for(String p:allproduct) {
			if(p==product) {
				return p;
			}
		}
		return "";
	}
	  public String testSearchProductFoundbyorderno(Integer orderno) {
	        Map<Integer, String> orderMap = new HashMap<>();
	        orderMap.put(1, "phone");
	        orderMap.put(2, "watches");
	        orderMap.put(3, "earphone"); 	 
	        	 for (Integer key : orderMap.keySet()) {
	                 String value = orderMap.get(key);
	                 if(key==orderno) {
	                	 return value;
	                 }
	             }
	        	 return "";
	  }
};


public class kaushik {
	@Test
	public void test2() {
		String temp="invalid";
		String [] allproduct= {"phone","watches","earphone"};
		int orderno=2;
		Alltests a=new Alltests();
		String result = (orderno <= allproduct.length) ? allproduct[orderno - 1] : temp;
		assertEquals(result,a.testSearchProductFoundbyorderno(orderno));
	}
	
	
}
