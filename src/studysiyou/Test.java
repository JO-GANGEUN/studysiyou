package studysiyou;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*整数だけで構成されたリストから3つの数を選択して掛け算を行い、その積が最大になるような値を出力するプログラムを実装してください。
入力は整数値が , 区切りで渡されます。リストの要素の数が3に満たない場合は-1を出力してください

※ 入力される整数には0や負の値が含まれる場合があります*/
public class Test {
	public static void main(String[] args) throws java.lang.Exception {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String input = br.readLine();
		String input = "-1,-10,-1,12,39,-40";
		System.out.println("0  : " + sortArray(input));
		String input1 = "2,-8,6,4";
		System.out.println("1  : " + sortArray(input1));
		String input2 = "-1,-5,3,2";
		System.out.println("2  : " + sortArray(input));
	}

	private static String sortArray(String input) throws ParseException {
		if (input != null && input.equals("") || input.split(",").length < 4) {
			return "err!";
		}
		List<Integer> intArray = new ArrayList<Integer>();

		String[] splitStrArray = input.split(",");
		for (String s : splitStrArray) {
			intArray.add(Integer.parseInt(s));
		}

		Collections.sort(intArray);
		System.out.println(intArray);
		int mid = 0;
		int len = intArray.size();

		for (int i = 0; i < len; i++) {
			if (intArray.get(i) > 0) {
				mid = i;
				break;
			}
		}

		Integer negativeMultiply = 0;
		Integer positiveMultiply = 0;
		// Integer positiveMax = intArray.get(len - 1);

		Integer max = 0;

		negativeMultiply = intArray.get(0) * intArray.get(1);
		int arrLength = intArray.size();
		positiveMultiply = intArray.get(arrLength - 2) * intArray.get(arrLength - 1);

		if (negativeMultiply > positiveMultiply) {
			max = negativeMultiply;
		} else {
			max = positiveMultiply;
		}
		return String.valueOf(max);
	}
}
