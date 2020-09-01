import java.util.*;

class DivisionValues{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Divisor");
    int divisor = 0;
    divisor = sc.nextInt();
    System.out.println("Enter the Dividend");
    int dividend = 0;
    dividend = sc.nextInt();
    int q=0;
    q=dividend/divisor;
    System.out.println("Quotient = "+q);
    int r=0;
    r=dividend%divisor;
    System.out.println("Remainder = "+r);
  }
}
