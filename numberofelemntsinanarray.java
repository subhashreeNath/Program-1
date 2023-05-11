package pracc;
import java.util.Scanner;
public class numberofelemntsinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 0; //# of elements in list
		while(s.hasNextInt()) {
		    n++;
		    s.next();           
		} 
		System.out.println(n);
	}

}
