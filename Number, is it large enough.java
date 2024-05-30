
import java.util.Scanner;

public static whileloops{
 public static void main (String[] argus){
     Scanner s=new Scanner(System.in);

     System.out.println("Enter a big number");
     int x = s.nextInt();

     While(x < 100){
        System.println("That's not big enough ");
        System.println("Try again ");
        x = s.nextInt();
     }
  }    
}