package algorithm.continiousArray1;

import java.util.Arrays;
import java.util.Scanner;

public class ContiniousArray01 {

	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * ジョは漫画銀魂を読んでいます。
	 * ジョは不思議な読み方をしていて、最初から読めず、主人公が出てる部分をあっちこっち読んでいます。
	 * ふと、ジョは急に主人公が連続で出ているのかが気になりました。
	 * 果たして主人公なのに、連続で出ているのでしょうか？
	 * <br>
	 * <p>
	 * 前提条件
	 *・ジョは1~100万の自然数の中のエピソードを読んでいます。
	 *・ジョは読み方が悪くて、ランダムで読んでいます。
	 * ・ジョは記憶力がよくて、見たものは二度とは見ません！
	 * </p>
	 * INPUT:読だエピソードの羅列[7 2 6 8 ...] (mainのargsを使うか、scannerで入力するかかまいません) 
	 * OUTPUT:エピソードの羅列が連続だったら、TRUEを出力、ではない場合はFALSEを出力
	 * 例１：[76 73 71 72 75 74] -> TRUE
	 * 例２：[2 4 1 5] -> FALSE
	 * 
	 * 
	 * 回答１： using for Arrays.sort
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("insert you numbers :");
		String strTrgt = scanner.nextLine();

		String[] strArray = strTrgt.split("\\s+");

		int[] intArray = Arrays.asList(strArray).stream().mapToInt(Integer::parseInt).toArray();

		Arrays.sort(intArray);

		int len = intArray.length;
		int fisrtTrgt = intArray[0];
		int lastTrgt = intArray[len - 1];

		boolean flag = true;

		if ((lastTrgt - fisrtTrgt) != (len - 1)) {

			flag = false;
			return;
		}

		if (flag) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
