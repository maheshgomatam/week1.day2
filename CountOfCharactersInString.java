package week1.day2;

public class CountOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'e') 
			{
				count++;
			}
		}
	    System.out.println("Total number of character c in the string :" + count);
	}

}
