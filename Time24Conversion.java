package practice;
import java.util.*;
public class Time24Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner q=new Scanner(System.in);
			System.out.println("enter the size of matrix");
			int N=q.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=q.nextInt();
			}
			 int x=arr[0],y=arr[0];
		     int n=N,m=N;
		      for(int j=0;j<N;j++) {    
		           if(x>arr[j]) 
		             x=arr[j];
		        else if(y<arr[j])
		            y=arr[j]; }
		     int ar[]=new int[N];
		     for(int i=0;i<N;i++){
		         ar[i]=arr[i];
		     }System.out.println("X"+x);
		     System.out.println("y"+y);
		 // Search x in array 
		     
		     for(int i = 0; i < n; i++){
		       if(ar[i] == x){
		    	   n=n-1;
		         // shifting elements
		         for(int j = i; j < n ; j++){
		             ar[j] = ar[j+1];
		         }
		         break;}}
		       long temp1=0;
		      for(int j=0;j<n;j++) {
		    	  System.out.println("array"+ar[j]);
		    	  temp1+=ar[j];
		    
		     }System.out.println(temp1);
		     // Search y in array  
		      for(int i = 0; i < n; i++){
		          if(arr[i] == y){
		       	   m=m-1;
		            // shifting elements
		            for(int j = i; j < m ; j++){
		                arr[j] = arr[j+1];
		            }
		            break;}}
		        long temp2=0;
		         for(int j=0;j<n;j++) {
		        	 System.out.println("array"+arr[j]);
		        temp2+=arr[j];
		        }
		     
		     System.out.println(temp2+" "+temp1);

		
	}

}
