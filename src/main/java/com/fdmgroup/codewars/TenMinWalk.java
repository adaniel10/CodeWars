package com.fdmgroup.codewars;

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {
	public static boolean isValid(char[] walk) {
		Map<Character, Integer> compass = new HashMap<>();
		compass.put('n', 5);
		compass.put('s', -5);
		compass.put('e', 5);
		compass.put('w',-5);
		int startingPoint = 0;
		
		if(walk.length == 10) {
			for(int i=0; i<walk.length; i++){
				if(compass.containsKey(walk[i]))
					startingPoint += compass.get(walk[i]);
			}
			
			if(startingPoint == 0)
				return true;
		}
		
		return false;
	}
}
