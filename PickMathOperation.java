import java.util.Scanner;

public class PickMathOperation {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      int number1 = myObj.nextInt();
      int number2 = myObj.nextInt();
      int number3 = myObj.nextInt();
      System.out.println("The first number " + number1); 
      System.out.println("The second number: " + number2); 
      System.out.println("The third number: " + number3); 
      
 
  System.out.println("The math oeration: " +  pickIt(number1, number2, number3));
    }
  }

  public static String  pickIt(int number1, int number2, int number3) {
  String operations= "";
  if (number1+number2==number3){
   
    operations =operations.concat("+");
    

  };
    if (number1*number2==number3) {
    operations =operations.concat("*");

  };
   if (number1-number2==number3) {
    operations =operations.concat("-");

  };
    if (number1/number2==number3) {
    operations =operations.concat("/");

  };
   if (operations.equals("") ){
    operations = "None";
   }
    
    return operations;


}
}



// Please complete the following programming problem in Java and upload your code to github in
// an open repository. Please be advised that you might have to create a free account.
// Write a function that takes three Integer numbers Number1, Number2, and Number3, and
// determines if there is a mathematical operation that will make Number1 (operation) Number2
// equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
// complete the function, return the String representation of the mathematical function. If none of
// the 4 mathematical operations can make the statement true, return the String "None".
// For instance:
// public String mathFunction(1,2,3) returns "+",
// public String mathFunction(2,2,4) returns "+*", (+ and *)
// public String mathFunction(3,-3,-9) returns "*",
// public String mathFunction(1,2,-1) returns "-",
// public String mathFunction(3,3,1) returns "/",
// public String mathFunction(7,1,11) returns "None".
// You need not use Scanner to input numbers from the user if you would not like to. You can
// simply write a function that takes the appropriate parameters and pass those parameters in the
// main method. For extra credit, write tests using Junit.
// Thank you for your interest and candidacy,
// Method Industries