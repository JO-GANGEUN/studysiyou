package algorithm.continiousArray1;

import java.util.Arrays;
import java.util.Scanner;

public class ContiniousArray02 {

	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * 回答２：Collectionのsortを使用せず、
	 * MAX, MINを取得し、比較して処理する
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("insert you numbers :");

		String strTrgt = scanner.nextLine();

		String[] strArray = strTrgt.split("\\s+");

		int[] intArray = Arrays.asList(strArray).stream().mapToInt(Integer::parseInt).toArray();

		Arrays.sort(intArray);

		int len = intArray.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < len; i++) {

			if (max < intArray[i]) {
				max = intArray[i];
			}

			if (min > intArray[i]) {
				min = intArray[i];
			}

		}

		boolean flag = ((max - min + 1) == len) ? true : false;

		if (flag) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
