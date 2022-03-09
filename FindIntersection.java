package week3.day2;


import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		List<Integer> obj=new ArrayList<Integer>(6);
		obj.add(3);
		obj.add(2);
		obj.add(11);
		obj.add(4);
		obj.add(6);
		obj.add(7);
        
		List<Integer> obj1=new ArrayList<Integer>(6);
		obj1.add(1);
		obj1.add(2);
		obj1.add(8);
		obj1.add(4);
		obj1.add(9);
		obj1.add(7);
		
		for(int i=0;i<obj.size();i++) {
			for(int j=0;j<obj1.size();j++) {
				if(obj.get(i)==obj1.get(j)) {
					System.out.println(obj.get(i));
				}
			}
		}
	}

}
