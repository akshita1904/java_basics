import java.util.*;

class FToC{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Temp in F");
    int f;
    f = sc.nextInt();
    int c;
    c=(f-32)*5/9;
    System.out.println("Temp in C = "+c);
  }
}
