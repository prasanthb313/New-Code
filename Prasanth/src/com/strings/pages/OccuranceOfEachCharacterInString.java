package com.strings.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfEachCharacterInString {
public static void main(String[] args) {
	String sentence="my name is prasanth";
	char array[]=sentence.toCharArray();
	Map<Character,Integer>count=new HashMap<Character, Integer>();
	for(Character c:array)
	{
		if(count.containsKey(c))
		{
			count.put(c,count.get(c)+1);
		}
		else
			count.put(c, 1);
	}
	Set<Entry<Character, Integer>> set=count.entrySet();
	Iterator<Entry<Character, Integer>> itr=set.iterator();
	while(itr.hasNext()){
		Entry<Character, Integer> entry=itr.next();
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
	System.out.println("another iteration method....................");
	
	for(Map.Entry<Character, Integer> entry:count.entrySet())
	{
		System.out.println(" "+entry.getKey()+"   character occured times is  "+entry.getValue());
	}
}
}

