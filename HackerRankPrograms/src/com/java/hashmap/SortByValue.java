package com.java.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByValue {

	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	public void setValueOnMap(int key, String value){
		map.put(key, value);
	}
	
	public Map<Integer, String> getValueFromMap(){
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortByValue sbv = new SortByValue();
		sbv.setValueOnMap(12, "Aarti");
		sbv.setValueOnMap(15, "Sonam");
		sbv.setValueOnMap(17, "Anita");
		sbv.setValueOnMap(13, "Premlata");
		sbv.setValueOnMap(14, "Komal");
		sbv.setValueOnMap(20, "Namita");
		sbv.setValueOnMap(25, "Babita");
		
		Map<Integer, String> _map = sbv.getValueFromMap();
		/*Iterator<Map.Entry<Integer, String>> _it = _map.entrySet().iterator();
		while(_it.hasNext()){
			Map.Entry<Integer, String> _map_value = _it.next();
			System.out.println(_map_value.getKey()+"|"+_map_value.getValue());
		}*/
		
		Set<Entry<Integer, String>> set = _map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(set);
		System.out.println("HashMap values Before sort:");
		for(Map.Entry<Integer, String> listBeforeSort : list){
			System.out.println(listBeforeSort.getKey()+" | "+listBeforeSort.getValue());
		}
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){
			public int compare(Map.Entry<Integer, String> value1, Map.Entry<Integer, String> value2){
				return value1.getValue().compareTo(value2.getValue());
			}
		});
		
		System.out.println("HashMap values After sort:");
		for(Map.Entry<Integer, String> listBeforeSort : list){
			System.out.println(listBeforeSort.getKey()+" | "+listBeforeSort.getValue());
		}
	}

}
