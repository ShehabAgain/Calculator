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

    if (operation.equals("sum")) {
      System.out.printf("%n%f+%f=%f",num1,num2,num1+num2);
    } else if (operation.equals("product")) {
      System.out.printf("%n%f*%f=%f",num1,num2,num1*num2);
    } else if (operation.equals("quotient")) {
      System.out.printf("%n%f/%f=%f",num1,num2,num1/num2);
    } else if (operation.equals("difference")) {
      System.out.printf("%n%f-%f=%f",num1,num2,num1-num2);
    }else if (operation.equals("square")) {
      System.out.printf("%n%f^%f=%f",num1,num2,Math.pow(num1,num2));
    } else {
      System.out.printf("invalid operation: %s",operation);
    }
    scanner.close();
  }
}