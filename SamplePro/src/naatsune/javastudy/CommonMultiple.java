package naatsune.javastudy;

public class CommonMultiple {

	public static void main(String[] args) {
		// 論理積について
		int i = 1;
		while(i < 100) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}
	}

}
