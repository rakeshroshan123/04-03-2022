package charecters;

public class counting {
	
	    public static void main(String[] args) {
	        String str = "r a k e s h r o s h a n ";
	 
	        int count = 1;
	 
	        for (int i = 0; i < str.length() - 1; i++)
	        {
	            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of letters in a string : " + count);
	    }
	}
	 

