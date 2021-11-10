package naatsune.javastudy;

// クラス定義
// クラスとはフィールド(データを格納)とメソッド（処理の記述）の２つから構成されている
class Staff {
	// フィールドの定義（データを格納）
	String name;	// 氏名
	int staffid;	// ID
	String email;	// メールアドレス
	int age;		// 年齢
	
	// メソッドの定義
	public void sayhello() {
		System.out.println("Hello!! My name is " + this.name);
	}
	
	//コンストラクタ
	public Staff(String name, int staffid, String email, int age) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
		this.age = age;
	}
	
//	ゲッターおよびセッターを設定
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class RemoteStaff extends Staff {
	// フィールドの定義（データを格納）
	String location;	// 勤務地
	
	// スーパークラスからコンストラクタを生成
	public RemoteStaff(String name, int staffid, String email, int age, String location) {
		super(name, staffid, email, age);
		// TODO 自動生成されたコンストラクター・スタブ
		this.location = location;
	}

	// ゲッターおよびセッターを定義
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}

public class StaffInfo {

	public static void main(String[] args) {
		// インスタンス(実体)を生成と初期化
		Staff yamada = new Staff("Ryuta Yamada", 12345, "example.com", 26);
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 54321, "example.com", 27, "大阪");
		
		// 山田の情報を格納
		// コンストラクタで初期化を行うため不要
		// yamada.name = "Ryuta Yamada";
		// yamada.email = "example.com";
		// yamada.age = 26;
		
		// sayhelloメソッドを呼び出す
		// yamada.sayhello();
		System.out.println("【社員情報】");
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStaffid());
		System.out.println("メールアドレス：" + yamada.getEmail());
		System.out.println("年齢：" + yamada.getAge());
		
		System.out.println("【社員情報】");
		System.out.println("氏名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStaffid());
		System.out.println("メールアドレス：" + tanaka.getEmail());
		System.out.println("年齢：" + tanaka.getAge());
		System.out.println("勤務地：" + tanaka.getLocation());
	}

}
