public class TestUsb {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// �����豸���ӵ�������
		computer.setUsb1(new Mouse());
		computer.setUsb2(new Keyboard());
		
		System.out.println(computer.getUsbInfo());
	}
}
