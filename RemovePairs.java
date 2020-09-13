package testpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemovePairs {
	//input 1,2,2,3,3 -->output 1
	//input 1,2,2,3--> output 1,3
	//input 1,2,2,3,3,1 --> 1,1--> [] is final output
	//input 1,2,2,3,1 --> output 1,3,1
	

	static Stack<Integer> output_stack = new Stack<Integer>();

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 2, 1));
		removePairs(list);
		System.out.println("Array list Final : " + output_stack);
	}

	private static boolean checkLastElement(int i, ArrayList<Integer> list) {
		if (i == list.size() - 1)
			return true;
		return false;
	}

	private static void removePairs(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {

			int j = i + 1;
			if (checkLastElement(i, list)) {
				add(i, list);
				break;
			}

			if (list.get(i) == list.get(j)) {
				i = i + 1;
				continue;

			} else {
				add(i, list);
			}
		}

	}

	private static void add(int i, ArrayList<Integer> list) {
		int len = output_stack.size();
		Integer number = 0;
		if (len != 0) {
			number = (Integer) output_stack.peek();

		}
		if (number == list.get(i)) {

			output_stack.pop();

		}

		else {

			output_stack.push(list.get(i));

		}

	}

}
