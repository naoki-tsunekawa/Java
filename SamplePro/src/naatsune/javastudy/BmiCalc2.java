package naatsune.javastudy;

import java.util.Scanner;

public class BmiCalc2 {
	/*
	 * BMI (体格指数)を計算するプログラム
	 * BMI = 体重(kg) / （身長(cm) * 身長(cm)）
	 * 体重 kg, 身長 m
	 * 
	 * 値はキーボードからの入力したもので計算する
	 * 
	 */
	public static void main(String[] args) {
		// 変数宣言
		double weight,height,bmi;
		
		// キーボードから身長体重を入力する
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？(kg) : ");
		weight = stdIn.nextDouble();
		System.out.println("身長は？(cm) : ");
		height = stdIn.nextDouble();
		
		// 身長をメートルに変換する
		height /= 100;
		
		// BMI計算
		bmi = weight / (height * height);
		
		System.out.println("あなたのBMIは"+ bmi + "です。");
		
		// BMIによって肥満度を判定する
		if(bmi < 18.5) {
			System.out.println("やせ型です");
		} else if(bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}
		
	}

}
