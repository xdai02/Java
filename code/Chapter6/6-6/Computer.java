public class Computer {
    private USB usb1;
    private USB usb2;

    public void setUSB1(USB usb) {
        usb1 = usb;
    }

    public void setUSB2(USB usb) {
        usb2 = usb;
    }

    @Override
    public String toString() {
        return "USB 1: " + usb1.getDeviceInfo() + "\n"
                + "USB 2: " + usb2.getDeviceInfo();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setUSB1(new Mouse());
        computer.setUSB2(new Keyboard());

        System.out.println(computer);
    }
}
