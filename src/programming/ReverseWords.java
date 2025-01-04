package programming;

public class ReverseWords {
	public static String reverseWords(String s) {
		s = s.trim();
		StringBuffer string = new StringBuffer();
		
		String a[] = s.split("\\s+");
		for(int i=a.length-1; i>=0; i--) {
			string.append(a[i]);
			if(i>0) {
				string.append(" ");
			}
		}
		return string.toString();
	}
	public static String reverse(String s) {
	    // Trim the string to remove leading and trailing spaces
	    s = s.trim();
	    
	    StringBuffer sos = new StringBuffer();
	    String[] words = s.split("\\s+");  // Split by one or more spaces

	    // Iterate from the last word to the first
	    for (int i = words.length - 1; i >= 0; i--) {
	        sos.append(words[i]);
	        
	        // Append a space if it's not the last word
	        if (i > 0) {
	            sos.append(" ");
	        }
	    }
	    
	    return sos.toString();
	}

	public static void main(String[] args) {
		String s = "    blue  blah              bla ";
		System.out.println("'"+reverseWords(s)+"'");
		System.out.println("'"+reverse(s)+"'");
	}
}
