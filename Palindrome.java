
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "radcliff";
		String str2 = "";
		
		//System.out.println(str1.length());
				
		
	    for (int i = str1.length() - 1; i >= 0 ; i--)
	    { 
	    	str2 = str2 + str1.charAt(i); 
	    }
		 
			System.out.println("Reverse of the string is :" + str2);
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Entered string is a palindrome");
			}
			else {
			System.out.println("Entered string is not a palindrome");
			}
		}
	}
