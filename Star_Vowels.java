import java.util.* ;

class Star_Vowels{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s = "";
		int i = 0;
		s = sc.nextLine();
		System.out.println("The entered sentence is " + s);

		for(i=0; i<s.length(); ++i){
			System.out.println(s.charAt(i) + "a".getClass().getName() + "character at i is " + s.charAt(i) == "a");	
			if(s.charAt(i).equals('a') || s.charAt(i).equals('e') || s.charAt(i).equals('i') )
			{
				System.out.println("gggggggg");
			}
			
		}
		System.out.println("The altered sentence is:" + s);
	}
}
		