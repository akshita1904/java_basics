import java.util.*;

class SI{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Int P;
    System.out.println("Enter P");
    P=sc.nextInt;
    Int R;
    System.out.println("Enter R");
    R=sc.nextInt;
    Int T;
    System.out.println("Enter T");
    T=sc.nextInt;
    int si;
    si=P*(1+R/100)^T;
    System.out.println("CI = "+si);
  }
}
