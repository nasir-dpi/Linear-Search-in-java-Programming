package linearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter Item");
		int item = scanner.nextInt();
		int loc= -1;
		for(int i =0;i<arr.length;i++ ) {
			if(arr[i] == item) 
			loc = i;
			
	
		}
		//if(loc>-1)
		if(loc==-1)
			System.out.println("tem Not found");
		else
		System.out.println("Item in "+loc);
		
			
	}
	

}
