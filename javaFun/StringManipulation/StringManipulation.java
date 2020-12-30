public class StringManipulation{
public static void main(String[] args) {
	
	System.out.println("the output is ---->"+trimAndConcat("    Hello     ","     World    "));
	System.out.println("the output is ---->"+getIndexOrNull("Coding","o"));
	System.out.println("the output is ---->"+getIndexOrNull("Hello","llo"));
	System.out.println("the output is ---->"+concatSubstring("Hello", 1, 2, "world"));
}
	public static String trimAndConcat(String one,String two){
		String output=one.trim()+two.trim();
			return output;
	}
	public static Integer getIndexOrNull(String sentence,char character){
		if(sentence.indexOf(character)>0){
			return sentence.indexOf(character);
		}
		else{
			return null;
		}
	}
	public static Integer getIndexOrNull(String sentence,String subsentence){
		if(sentence.indexOf(subsentence)>0){
			return sentence.indexOf(subsentence);
		}
		else{
			return null;
		}
	}
	public static String concatSubstring(String one,int numone, int numtwo, String two){
		return one.substring(numone, numtwo).concat(two);
	}
}