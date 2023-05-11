package pracc;
import java.util.*;  

public class permutationofanumber {

	public static void main(String[] args) {
		
	   
		{     
		int totalobjects, selectedobject, permutation, f1, f2;    
		 
		Scanner sc = new Scanner(System.in);    
		System.out.println("Enter the Value of a and b: ");    
		totalobjects = sc.nextInt();    
		selectedobject = sc.nextInt();    
		f1 = totalobjects;    
		for (int i = f1- 1; i >= 1; i--) {    
		   
		f1 = f1 * i;    
		}    
		int number;    
		number = totalobjects - selectedobject;    
		f2 = number;    
		for (int i = f2 - 1; i >= 1; i--)   { 
		    
		f2 = f2 * i;    
		}    
		permutation = f1 / f2;    
		System.out.println("The permutation of P(n, r) = "+permutation);    
		}    
		}    

	}


