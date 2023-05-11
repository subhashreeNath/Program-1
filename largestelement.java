package pracc;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=  {12,13,14,15,20};
		 int max = arr[0];  
	        
	        for (int i = 0; i < arr.length; i++) {  
	           
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest number in the array " + max);  
	    }  
	  
				

	}

