public class Computer {
	// 电脑有2个USB接口
	private USB usb1;
	private USB usb2;
	
	public void setUsb1(USB usb1) {
		this.usb1 = usb1;
	}
	
	public void setUsb2(USB usb2) {
		this.usb2 = usb2;
	}
	
	/**
	 * 获取USB接口连接设备的信息
	 */
	public String getUsbInfo() {
		return "USB 1: " + this.usb1.getDeviceInfo() + "\n"
				+ "USB 2: " + this.usb2.getDeviceInfo();
	}
}
