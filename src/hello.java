import java.util.Locale;

public class hello {
    public static int doubly(int x) {
        return x * x;  // means to multiply
        // x++ means to increment or add 1
        // x-- means to decrement

    }
    public static void main(String[] args) {
        // this is like a map
        // f(x) x*x;   // we call 5 the argument,x the parameter;doubly is the name of function.
                       // its a set of instructions i can use repeatedly
        // f(5) = 5 * 5
        int doubled = doubly( 5);
        int otherDoubled = doubly(10);
        System.out.println(doubled);
        System.out.println(otherDoubled);

        String name = "Shantel";
        char firstInital = name.charAt(name.length() - 1);  // represents letters
        String lowered = name.toLowerCase();


//       System.out.println("Hello World ");
        // How to print
        // This allows you to access the libraries, methods and classes


        // Variables
//        int num = 5;
 //       System.out.println(num);  // you wanna add num cause the value can change at anytime
        // we can have numbers, integers, whole numbers
        // This is creating a number in Java
        // equals is the assignment operator
        // num means that you are referring a number into the program


//        double doubly = 4.6;   // means decimal numbers.Has the data type double.
        // we can have whole numbers or decimals
//        char firstInitial = 'S'; // use single quotations, and are individual characters
//        String name = "Shantel";  // are characters that use double quotations, followed by a series of characters
        // in a order
  //      boolean isHome = true;  // or can be false. Its either a 0 or 1

      // variables are created because you use specific pieces of data you use throughout your program
/*
        System.out.println(num);
        System.out.println(doubly);
        System.out.println(name);
        System.out.println(firstInitial);
        System.out.println(isHome);
*/                           // when you comment out you allow that piece of code not to run

        // Control flow allows you to create if/else statements
        // the items in parenthesis has to be a condition

//        if (num < 18) {  // you can also do a <> or = or ==; to get the desired value ot you can use !(means does not)
//            System.out.println("You are not an adult");
 //       }
        // with numbers we get something called conditional/relational operators. We are talking about the relationship
        // between the variable num and 18
        // !-means do not, &&-means and , || means or


        // these are called conditionals/If Else/conditions
//        if (name.equals("Shantel")) {
//            System.out.println("Happy hacking!");
 //       } else {
//            System.out.println("Have a nice day!");
 //       }

        //while loops
        // are loops that allow you run a code repeatedly until the condition is met
//        while (num < 18) {
 //           System.out.println("You thought you knew");
//            num = num + 1;
 //           num++;     // if the increment is not implemented the while loop will run forever until it reaches the goal
 //       }
        // here you have for loops,while loops and do while loops
        // are loops that are used to iterate a part of the program several times.
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i);
 //       }

        // This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
 //        int x = 0;
 //       do {
//            System.out.println("Happy New Year!");
 //           x++;   // once this is incremented this condition will be false at some point
 //       } while(x <10);


    }
}


