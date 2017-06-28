package session6_assignment3;
import java.util.Scanner;
public class Binary_Search_Algo {
public static void main(String[] args) {
	int first,last,item,counter,num,array[],middle;
	
	/*scanner class object is used to take the size of array 
	to store elements*/
	Scanner s=new Scanner(System.in);	
	System.out.println("plz enter numbers of elements");
	num=s.nextInt();
    
	//creating an array of size given as input by the user
	array=new int[num];
	
	System.out.println("plz enter "+num+"elements");
	
	//taking array elements as input from user
	for(counter=0;counter<num;counter++)
		array[counter]=s.nextInt();
		
	//taking search element as input from user to search in array 
		System.out.println("enter search value");
		item=s.nextInt();
	/*divide and conquer approach use to search the inputed element
	  in the array called Binary Search Algorithm*/
		first=0;
		last=num-1;
		middle=(first+last)/2;
		
		 while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	      s.close();
	   }
	}
		
	
