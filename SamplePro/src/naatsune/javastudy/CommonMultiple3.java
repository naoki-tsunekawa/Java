package naatsune.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// NOT演算子について
		// 2または3の公倍数以外を表示するプログラム
		int i = 1;
		while(i < 20) {
			if (!((i % 2 == 0) && (i % 3 == 0))) {
				// NOT演算子の適用範囲
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}
	}

}
