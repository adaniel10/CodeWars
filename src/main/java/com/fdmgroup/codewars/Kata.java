package com.fdmgroup.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arrayOfArrays.length; i++)
			list.add(arrayOfArrays[i].length);

		Collections.sort(list);

		if (list.contains(0) || list.size() == 0)
			return 0;

		for (int i = 0; i < list.size(); i++) {
			if (i + list.get(0) != list.get(i))
				return i + list.get(0);
		}
		return -1;
	}

	public static int findEvenIndex(int[] arr) {
		int indexPosition = 0;

		while (indexPosition < arr.length) {
			int leftSum = 0;
			int rightSum = 0;

			if (indexPosition != 0) {
				for (int i = 0; i < indexPosition; i++)
					leftSum += arr[i];
			}

			for (int i = indexPosition + 1; i < arr.length; i++)
				rightSum += arr[i];

			if (leftSum != rightSum)
				indexPosition++;
			else
				return indexPosition;
		}
		return -1;
	}

	public static String createPhoneNumber(int[] numbers) {

		String[] phoneNumber = new String[] { "(", "", "", "", ")", " ", "", "", "", "-", "", "", "", "" };
		int position = 1;

		for (int i = 0; i < numbers.length - 7; i++) {
			phoneNumber[position] = Integer.toString(numbers[i]);
			position++;
		}

		position += 2;

		for (int i = 3; i < numbers.length - 4; i++) {
			phoneNumber[position] = Integer.toString(numbers[i]);
			position++;
		}

		position++;

		for (int i = 6; i < numbers.length; i++) {
			phoneNumber[position] = Integer.toString(numbers[i]);
			position++;
		}

		return String.join("", phoneNumber);
	}

}
