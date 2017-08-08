package com.fdmgroup.codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEncoder {

	public static String encode(String word) {
		
		String lowerCase = word.toLowerCase();
		Set<Character> nonUniqueWords = new HashSet<Character>();
		char[] modifiedWord = lowerCase.toCharArray();
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < modifiedWord.length; i++) {
			for(int j=i+1; j<modifiedWord.length; j++) {
				if(modifiedWord[j] == modifiedWord[i]) 
					nonUniqueWords.add(modifiedWord[j]);
			}
		}

		list.addAll(nonUniqueWords);
				
		for(int i=0; i<list.size(); i++){	
			for(int j=0; j<modifiedWord.length; j++){
				System.out.println(String.format("Comparing List[%d] '%s' == ModifiedWord[%d] '%s'", i, list.get(i), j, modifiedWord[j]));
				if(list.get(i) == modifiedWord[j]) {
					System.out.println("equal");
					modifiedWord[j] = ')';
				}
				else {
					System.out.println("not equal");
				}
				printList(modifiedWord);
			}
		}
		
		for(int i=0; i<modifiedWord.length; i++){
			if(modifiedWord[i] != ')')
				modifiedWord[i] = '(';
		}
		
		return new String(modifiedWord);
	}
	
	public static void printList(char[] list){
		for(int i=0; i < list.length; i++)
			System.out.print("'"+list[i]+"' ");
		System.out.println();
	}

}
