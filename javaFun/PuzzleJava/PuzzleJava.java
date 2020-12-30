import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class PuzzleJava{
    public void sumAndGreaterThan10(int[] arr){
        ArrayList<Integer> newArray= new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i]>10){
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }
    public void shuffleStrings(String[] arr){
        ArrayList<String> newList= new ArrayList<String>();
        ArrayList<String> newListfive= new ArrayList<String>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>5){
                newListfive.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newListfive);
    }

    public void shuffleAlphabet(){
        ArrayList<String> alphaArr= new ArrayList<String>();
        for(char alpha = 'A'; alpha<= 'Z'; alpha++){
            alphaArr.add(Character.toString(alpha));
        }
        System.out.println(alphaArr);
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);
        System.out.println("First letter:" + alphaArr.get(0));
        System.out.println("Last letter: " + alphaArr.get(25));
        String sample = alphaArr.get(0);
        if("AEIOU".indexOf(sample)>0){
            System.out.println("its a vowel letter");
        } 
    }
    public void randNumber(){
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            int num=ThreadLocalRandom.current().nextInt(55, 101);
            randNums.add(num);
        }
        System.out.println(randNums);
    }
    public void randNumber2(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randNums2);
        System.out.println(randNums2);
        System.out.println("Smallest random number: " + min);
        System.out.println("Largest random number: " + max);
    }
    public void randomString(){
        Random rand= new Random();
        StringBuilder randString= new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i< 5; i++){
            randString.append(alpha.charAt(rand.nextInt(alpha.length())));
        }
        String output = randString.toString();
        System.out.println(output);
    }

    public void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    for(int i = 0; i<10; i++){
        for(int j = 0; j< 5; j++){
            randString.append(alpha.charAt(rand.nextInt(alpha.length())));
        }
        String output = randString.toString();
        randList.add(output);
        randString.setLength(0);
    }
    System.out.println(randList);       
    }
}