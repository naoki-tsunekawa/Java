package naatsune.javastudy;

// コンピュータの情報を格納するクラス
class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {
	
	public static void main(String[] args) {
		// インスタンスを生成
		Computer desktop = new Computer();
		desktop.os = "Windows 10";
		desktop.memory = 4;
		desktop.storage = 256;
		
		System.out.println("OS : " + desktop.os);
		System.out.println("Memory : " + desktop.memory + "GB");
		System.out.println("Storage : " + desktop.storage + "GB");
		
		// desktopインスタンスを参照する
		Computer desktop2 = desktop;
		desktop2.os = "Ubuntu";
		
		System.out.println("\nOS : " + desktop2.os);
		System.out.println("Memory : " + desktop2.memory + "GB");
		System.out.println("Storage : " + desktop2.storage + "GB");
		
		System.out.println("\nOS : " + desktop.os);
		System.out.println("Memory : " + desktop.memory + "GB");
		System.out.println("Storage : " + desktop.storage + "GB");
	}

}
