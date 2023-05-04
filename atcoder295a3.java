//リストとarrayを使ってみた。
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder295a3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		// sc.nextLine();  //nextLineで一気に読み込んでると思ったが、この行いらなくね？
		String[] word = { "and", "not", "that", "the", "you" };  //これはリストか？
		List<String> w = Arrays.asList(word);  //いや、ここでリスト化している？

		for (int i = 0; i < times; i++) {
			if (w.contains(sc.next())) {  //wのリストに含まれてるかどうかで判断
				System.out.println("Yes");
				return;
			}

		}
		System.out.println("No");
	}
}