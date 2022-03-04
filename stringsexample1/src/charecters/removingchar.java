package charecters;

public class removingchar {

	    public static void main(String[] args) {
	        String s = "rakesh";
	        String s1 = "roshan";
	        char[] ss = s.toCharArray();
	        char[] ss1 = s1.toCharArray();

	        for(int i=0;i<ss.length;i++){
	          for(int j=0;j<ss1.length;j++){
	                if(ss1[j] == ss[i]){
	                    ss1[j] = 'x'; //Replace the common char with x
	                }
	            }
	        }
	         
	        System.out.println(Arrays.toString(s,s1));
	    }
	    
}

