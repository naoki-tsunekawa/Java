package naatsune.javastudy;

public class BmiCalc {
	/*
	 * BMI (体格指数)を計算するプログラム
	 * BMI = 体重 / （身長 * 身長）
	 * 体重 kg, 身長 m
	 * 
	 */
	public static void main(String[] args) {
		// 変数宣言
		double weight,height,bmi;
		
		weight = 59;
		height = 164;
		
		// mをcmに変換する
		height /= 100;
		
		// bmi計算
		bmi = weight / (height * height);
		
		System.out.println(bmi);

	}

}
