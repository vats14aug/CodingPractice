package testpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class OneAway {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String first=br.readLine();
		String second=br.readLine();
		System.out.println(oneAway(first,second));
	}

	//pale,bale--> true (as to convert pale into bale we need only one edit )
	//pale,bake --> false
	private static boolean oneAway(String first,String second) {
		char[] arrFirst=first.toCharArray();
		int[] arr=new int[128];
		for(char ch: arrFirst)
		{
			arr[ch]++;
		}
		
		char[] arrSecond=second.toCharArray();
		for(char ch: arrSecond)
		{
			arr[ch]--;
		}

		long count=IntStream.of(arr).filter(p -> p==1).count();
		if (count==1)
		{
			return true;
		}
		else return false;
	}
	
}
