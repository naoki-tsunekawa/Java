package naatsune.javastudy;

// クラス定義
// クラスとはフィールド(データを格納)とメソッド（処理の記述）の２つから構成されている
class Staff {
	// フィールドの定義（データを格納）
	String name;
	int staffid;
	String email;
	int age;
	
	// メソッドの定義
	public void sayhello() {
		System.out.println("Hello!! My name is " + this.name);
	}
}


public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンス(実体)を生成
		Staff yamada = new Staff();
		
		// 山田の情報を格納
		yamada.name = "Ryuta Yamada";
		yamada.email = "example.com";
		yamada.age = 26;
		
		//sayhelloメソッドを呼び出す
		yamada.sayhello();
		
	}

}
