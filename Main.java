import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("enter the first number:");
    double num1 = scanner.nextDouble();
    System.out.printf("%nenter the second number:");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Which operator would you like to use?");
    String operation = scanner.nextLine();

    switch (operation){
      case "sum":  
        System.out.printf("%n%f+%f=%f",num1,num2,num1+num2);
        break;
      case "product":
        System.out.printf("%n%f*%f=%f",num1,num2,num1*num2);
        break;
      case "quotient":
          if (num2 ==0){
            System.out.print("dividing by zero is not possible");
          } else {
            System.out.printf("%n%f/%f=%f",num1,num2,num1/num2);
          }
        break;
      case "difference":
        System.out.printf("%n%f-%f=%f",num1,num2,num1-num2);
        break;
      case "square":
        System.out.printf("%n%f^%f=%f",num1,num2,Math.pow(num1,num2));
        break;
      default:
        System.out.printf("%s is not a supported operation" , operation);
        
        
        
    }
   
    scanner.close();
  }
}