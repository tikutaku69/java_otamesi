//Hashmap：キーと値のペアの配列
import java.util.*;

public class atcoder295c2 {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, Integer> aCheck = new HashMap<Integer, Integer>();  //なんだこれ、２次元配列使うの？
        //２次元配列ではなく、キーと値のペアをマップに格納する
        int result = 0;
        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            if(aCheck.containsKey(a)){  //aが含まれるとき
                aCheck.put(a, aCheck.get(a)+1);  //aキーに値をセット、getでaキーの値を得ている
            }else{
                aCheck.put(a, 1);  //無いときは価値を１に
            }
        }
        for (int a : aCheck.keySet()){
            result += aCheck.get(a)/2;  //この問題は２で割った商を合計すれば答えられる
        }
        System.out.println(result);
    }
}
