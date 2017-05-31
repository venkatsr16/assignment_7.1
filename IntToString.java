import java.util.*;
public class IntToString {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("Enter an integer");
		i=s.nextInt();
		String str = Integer.toString(i);
		System.out.println("Int converted to String is "+str);
	}
}
