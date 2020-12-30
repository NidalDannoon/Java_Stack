import java.lang.Math;  //Import Math Method
public class FizzBuzz{
public static void main(String[] args) {
	
	System.out.println("the output is ---->"+fizzBuzz(5));
	
}
    public static String  fizzBuzz(int num){
        if (num%3==0 && num%5==0){
			return "FizzBuzz";
		}
		else if (num%3==0 && num%5!=0){
			return "Fizz";
		}
		else if (num%3!=0 && num%5==0){
			return "Buzz";
		}
		else{
		String numberAsString = "" + num;
			return numberAsString;
		}
    }

}