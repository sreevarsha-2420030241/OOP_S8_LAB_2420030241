package lab_3;

public class nonrepeatingcharacter {
	public static void main(String[] args) 
	 {
	        String str="swiss";
	        int n=str.length();

	        for (int i=0;i<n;i++) {
	            char c=str.charAt(i);
	            boolean isRepeated = false;
	            for (int j=0;j<n;j++) 
	            {
	                if (i!=j && str.charAt(j)==c) {
	                    isRepeated = true;
	                    break;
	                }
	            }
               if (!isRepeated) 
	            {
	                System.out.println("First non-repeating character is: " + c);
	                return;
	            }
	        }
           System.out.println("No non-repeating character found.");
	    }
}
