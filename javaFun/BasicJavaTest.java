import java.util.Arrays;
public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava mytest = new BasicJava();       
        mytest.print1to255();
        mytest.printOdd();
        mytest.printSum();       
        int[] myArray = {1,3,5,-7,8,15};
        mytest.iteratingArray(myArray);
        mytest.findMax(myArray);
        mytest.findAvg(myArray);
        System.out.println(mytest.arrayOddNumber());
        System.out.println(mytest.greaterThanY(myArray, 5));
        System.out.println(mytest.eliminateNegative(myArray));
        System.out.println(Arrays.toString(mytest.squareValue(myArray)));
        System.out.println(Arrays.toString(mytest.maxMinAvg(myArray)));
        System.out.println(Arrays.toString(mytest.shiftingValue(myArray)));
    }   
}