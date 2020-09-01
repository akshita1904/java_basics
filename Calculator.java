import java.util.*;

class Calculator{
  public static void main(String args[]){
    Calculator ob = new Calculator();

    Scanner sc = new Scanner(System.in);

    while(true) {
      int a;
      System.out.println("enter the first no");
      a=sc.nextInt();
      int b;
      System.out.println("enter the second no");
      b=sc.nextInt();
      String c;
      System.out.println("enter the operator");
      c=sc.next();
      if(c.equals("*")) {
        System.out.println("The result : " + ob.multiply(a, b));
      }
      else if(c.equals("+")) {
        System.out.println("The result : "+ob.add(a, b));
      }
      else if(c.equals("/")) {
        System.out.println("The result : "+ob.divide(a, b));
      }
      else if(c.equals("-")) {
        System.out.println("The result : "+ob.subtract(a, b));
      }
      System.out.println("The end");
      System.out.println("Thank you");
    }
  }

  public int add(int a, int b) {
    int result = (a + b);
    return result;
  }

  public int subtract(int a, int b) {
    int result = (a - b);
    return result;
  }

  public int multiply(int a, int b) {
    int result = (a * b);
    return result;
  }

  public int divide(int a, int b) {
    int result = (a / b);
    return result;
  }
}
