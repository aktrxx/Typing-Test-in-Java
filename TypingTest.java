import java.io.*;
import java.util.*;

public class TypingTest {

public static void main(String[] args) throws IOException {

    long start = System.currentTimeMillis();
    File f= new File("sample.txt");
    Scanner s = new Scanner(f);
    Scanner sc = new Scanner(System.in);
    String fileText, A, B;


    String[] typedArr;
    String[] fileTextArr;

    fileText = s.nextLine();
    fileTextArr = fileText.split(" ");

    System.out.println("\ntype this sentence and hit ENTER\n");

    System.out.println(fileText+"\n");

    String userTyped = sc.nextLine();
    typedArr= userTyped.split(" ");
    int count = 0;

    //System.out.println(typedArr.length); 
    if (typedArr.length == fileTextArr.length){

        for (int i=0;i<typedArr.length;i++){
            A = typedArr[i];
            B = fileTextArr[i];
    
            if(!A.equals(B)){
                count++;
            }
        }
    }else {
        System.out.println("Sentence not matched, Try again");
        System.exit(0);
    }
    s.close();
    sc.close();   
    int Percentage = 100-(count*100/fileTextArr.length);
    long end = System.currentTimeMillis();
    
    
    int timeInMilli = (int)(end-start);
    // System.out.println(fileTextArr.length);
    // System.out.println(timeInMilli);
    

    //int intTimeInMilli = (int)timeInMilli;
    //long as = (long)fileTextArr.length;
    Double d = Double.valueOf(fileTextArr.length);
    Double d1 = Double.valueOf(timeInMilli);
    // System.out.println(d);
    // System.out.println(d1);
    Double WPM = (d*60000/d1);
    //Double data = new Double(WPM);
    int WPMi = (int)Math.round(WPM);
    
    System.out.println("\nYou got "+Percentage+"% Accuracy, in "+ WPMi +" Words Per Minute , Congrats\n");
  }
}