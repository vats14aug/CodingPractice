package testpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemovePairs {
	//input [1,2,2,3,3] -->output [1]
	//input [1,2,2,3]--> output [1,3]
	//input [1,2,2,3,3,1] --> 1,1--> [] is final output
	//input [1,2,2,3,1] --> output [1,3,1]
	

	static Stack<Integer> outputStack = new Stack<Integer>();

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 1, 1));
		removePairs(list);
		System.out.println("Array list Final : " + outputStack);
	}


	private static void removePairs(ArrayList<Integer> list) {
		
		for(int i=0;i<list.size();i++){
			int len = outputStack.size();
			if(len != 0)
			{
				if(outputStack.peek()!=list.get(i))
				{
				outputStack.push(list.get(i));
				}
				else
				{
					outputStack.pop();
				}
			}
			else
			{
				outputStack.push(list.get(i));
			}
			
			
		}
	}

	
}
