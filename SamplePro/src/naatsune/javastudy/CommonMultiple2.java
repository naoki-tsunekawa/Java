package naatsune.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// 論理和について
		// 2または3の倍数を、1から50未満の範囲で表示するプログラム
		int i = 1;
		while(i < 50) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}
	}

}
