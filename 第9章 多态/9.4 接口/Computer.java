public class Computer {
	// ������2��USB�ӿ�
	private USB usb1;
	private USB usb2;
	
	public void setUsb1(USB usb1) {
		this.usb1 = usb1;
	}
	
	public void setUsb2(USB usb2) {
		this.usb2 = usb2;
	}
	
	/**
	 * ��ȡUSB�ӿ������豸����Ϣ
	 */
	public String getUsbInfo() {
		return "USB 1: " + this.usb1.getDeviceInfo() + "\n"
				+ "USB 2: " + this.usb2.getDeviceInfo();
	}
}
