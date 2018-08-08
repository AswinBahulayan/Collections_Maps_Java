package com.map1.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Map<String, Integer> obj=new LinkedHashMap<String, Integer>();
		obj.put("Sony", 10);
		obj.put("Samsung", 8);
		obj.put("Mi", 5);
		obj.put("Vu", 8);
		obj.put("Philips", 15);
		obj.put("Hitachi", 14);
		obj.put("Sharp", 16);
		obj.put("Sansui", 13);
		/*for (java.util.Map.Entry<String, Integer>  eachcount : obj.entrySet()) {
			sum=sum+eachcount.getValue();
			System.out.println(sum);
		}
		//obj.se
				//Set<Entry<String, Integer>> entrySet = obj.entrySet();
		 */		Set<String> keySet = obj.keySet();
		 Collection<Integer> values = obj.values();
		 List<Integer> val=new ArrayList<Integer>();
		 val.addAll(values);
		 List<String> lastKey=new ArrayList<String>();
		 lastKey.addAll(keySet);
		 System.out.println(lastKey.get(lastKey.size()-1));
		 System.out.println(obj.get(lastKey.get(lastKey.size()-1)));
		 obj.put(lastKey.get(0), val.get(0)-1);
		 for (Entry<String, Integer> eachval : obj.entrySet()) {
			 System.out.println(eachval.getKey()+", "+eachval.getValue());

		 }


	}

}
