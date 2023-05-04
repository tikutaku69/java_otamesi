//2次元配列
import java.util.Scanner;

public class atcoder295b1{
	static public void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int r = sc.nextInt();
        int c = sc.nextInt();
      	String t = sc.nextLine(); //これ使ってないって警告されてるぞ。でも無いとエラーだわ。
        char[][] map = new char[r][c];  //２次元配列
      	for (int i=0; i<r; i++){
          	String str = sc.nextLine();
        	char[] tmp = str.toCharArray();  //１行を１文字ずつに分割かな？
          	for (int j=0; j<c; j++) map[i][j] = tmp[j];  //分割した１文字を配列に格納
        }

      	char[][] ret = new char[r][c];
      	for (int i=0; i<r; i++) ret[i] = map[i].clone();  //これで２次元配列コピーできんの？すご
      	for (int i=0; i<r; i++){
        	for (int j=0; j<c; j++){
            	if (map[i][j] != '.' && map[i][j] != '#'){
                	int power = map[i][j] - '0';  //- '0'ってなんでついてる？でも無いと間違えるわ。
                  	for (int k=0; k<r; k++){
                    	for (int l=0; l<c; l++){
                        	if ((Math.abs(i-k) + Math.abs(j-l)) <= power) ret[k][l] = '.';  //ret配列だけ更新される。map配列は更新してはいけない。
                        }
                    }
                }
            }
        }
      	for (int i=0; i<r; i++){
        	for (int j=0; j<c; j++){
            	System.out.print(ret[i][j]);  //retを出力
            }
          	System.out.println();
        }
    }
}