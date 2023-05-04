//読み込みと出力、while文を確認できた。
import java.util.*;
public class atcoder295a1 {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  //読み込みのインスタンスを作成
      int n = sc.nextInt();  //整数で読み込み
      while (n -- > 0) {
        String s = sc.next();  //文字列で読み込み
        if (s.equals("and") || s.equals("not") || s.equals("that") || s.equals("the") || s.equals("you")) {
            System.out.println("Yes");
            return;
        }
      }
      System.out.println("No");  //全てを通り抜けたらnoを出力
	}
}