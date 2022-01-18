public class TestUsb {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// 外设设备连接到电脑上
		computer.setUsb1(new Mouse());
		computer.setUsb2(new Keyboard());
		
		System.out.println(computer.getUsbInfo());
	}
}
