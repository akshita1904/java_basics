import java.util.*;
class Vowel {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sentence ");
    String s = sc.nextLine();

    for(int i=0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c.equalsIgnoreCase('a') || c.equalsIgnoreCase('e') || c.equalsIgnoreCase('i') || c.equalsIgnoreCase('o') || c.equalsIgnoreCase('u') ) {
        System.out.println("The letter is vowel" + c);
      }
    }
  }
}
