package testpractise;

import static java.util.stream.Collectors.toMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



class Frequency {
	

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		System.out.println(frequencySort(s));
	}
	
	public static String frequencySort(String s) {
        String result="";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        char[] arr=s.toCharArray();
        for(Character c: arr) {
        	if(map.containsKey(c)) {
        		//map.get(c).intValue()++;//=map.get(c)+1;
        		map.put(c,map.get(c)+1);
        		
        	}
        	else
        	{
        		map.put(c,1);
        	}
        	
        }
        //decreasing order by values
        Map<Character, Integer> sorted = map.entrySet().stream().sorted(Collections.
        		reverseOrder(Map.Entry.comparingByValue())).
        		collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        
        for(Character c : sorted.keySet())
        {
        	for(int i=0;i<sorted.get(c);i++)
        		
        	result+=c;
        }
        return result;
    }
}

