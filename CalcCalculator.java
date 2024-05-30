// this is a calculator to help you find areas!!
// You can find the ariea of--
// a- Triable, b- Square, or c- circle. 
// all you need to do is provide the variable needed, and the code will do the rest!!!!

import java.util.Scanner;

public class CalcCalculator{
    public static void main (String[]args){
        char triangleArea = 'a';
        char squareArea = 'b';
        char circleArea = 'c';
        char yes= 'a';
        char no= 'b' ;

        boolean i =true;

        Scanner x = new Scanner(System.in);
while (i=true) {
// Used while instead of for loops because i dont really know what values user will use.
// while loop offers more felxibility 
    System.out.println("Hello, welcom to Area Calculator ");
    System.out.println("Type in the letter of the vlue you want- " );
    System.out.println("a) triangle" );
    System.out.println("b) square" );
    System.out.println("c) circle" );

    char choice= x.next().charAt(0);

    if (choice == triangleArea ){
        System.out.println("What is the height?");
        double h = x.nextDouble();

        System.out.println("What is the base?");
        double b = x.nextDouble();

        double triangleAreaAnswer= (h * b)/2 ;

     System.out.println("Your triangle area is" + triangleAreaAnswer + ".");

    System.out.println("Do you want to calculate another area?" );
    System.out.println("Select the letter to your answer" );
    System.out.println("a) yes" );
    System.out.println("b) no" );

    char answer= x.next().charAt(0);

    if(answer==no){
        break; // needed to end the while loop
    }

}else if (choice== squareArea){
    System.out.println("What is the length of one of the sides?");
        double l=x.nextDouble();
    
        double squareAreaAnswer= (l*l); 

         System.out.println("Your circle area is" + squareAreaAnswer +".");
    System.out.println("Do you want to calculate another area?" );
    System.out.println("Select the letter to your answer" );
    System.out.println("a) yes" );
    System.out.println("b) no" );

    char answer= x.next().charAt(0);

    if(answer==no){
        break;
    }
// else if here to avoid adding too many if statment
//  Also provides better decision making process/ better to read for user. 
}else if (choice== circleArea){
    System.out.println("What is the radius?");
        double r=x.nextDouble();
    
        double pi= 3.14159;
        double circleAreaAnswer= (r*r) * pi ;

         System.out.println("Your circle area is" + circleAreaAnswer +".");

    System.out.println("Do you want to calculate another area?" );
    System.out.println("Select the letter to your answer" );
    System.out.println("a) yes" );
    System.out.println("b) no" );

    char answer= x.next().charAt(0);

    if(answer==no){
        break;
    }


       

} 

    }
}
    }
