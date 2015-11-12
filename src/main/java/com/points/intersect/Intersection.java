package com.points.intersect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Intersection {

	public static List<Integer> intersectNoDupes(List<Integer> list1, List<Integer> list2){
		if(list1.isEmpty() || list2.isEmpty()){
			return new ArrayList<Integer>();
		}
		
		Set<Integer> returnSet = new HashSet<Integer>();
		Map<Integer, Integer> list2Map = new HashMap<Integer, Integer>();
		fillMap(list2Map, list2);
		
		for(Integer element : list1) {
			if(returnSet.contains(element)){
				continue;
			}
			if(list2Map.containsKey(element)){
				returnSet.add(element);
			}			
		}
		
		List<Integer> returnList = new ArrayList<Integer>(); 
		returnList.addAll(returnSet);
		
		return returnList; 
	}
	
	public static List<Integer> intersectWithDupes(List<Integer> list1, List<Integer> list2){
		if(list1.isEmpty() || list2.isEmpty()){
			return new ArrayList<Integer>();
		}
		
		
		Map<Integer, Integer> returnMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> list1Map = new HashMap<Integer, Integer>();
		fillMap(list1Map, list1);
		Map<Integer, Integer> list2Map = new HashMap<Integer, Integer>();
		fillMap(list2Map, list2);
		
		for(Integer num : list1Map.keySet()) {
			if(list2Map.containsKey(num)){
				returnMap.put(num, list1Map.get(num) + list2Map.get(num) - 1);
			}			
		}
		
		return mapToList(returnMap); 
	}
	
	private static void fillMap(Map<Integer, Integer> map, List<Integer> list){
		for(Integer num : list){
			if(map.containsKey(num)){
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
	}
	
	private static List<Integer> mapToList(Map<Integer, Integer> map){
		List<Integer> returnList = new ArrayList<Integer>(); 
		
		if(map.isEmpty()){
			return returnList;
		}
		
		for(Integer num : map.keySet()){
			for(int i = 0; i < map.get(num); i++){
				returnList.add(num);
			}			
		}
		
		return returnList;
	}
	
}
