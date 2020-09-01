import java.util.*;
class Even{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i = 0;

		for(i=start;i<=end;i++){
			if(i%2==0){
				System.out.println(i+"is an Even no.");
			}
		}
	}
}
