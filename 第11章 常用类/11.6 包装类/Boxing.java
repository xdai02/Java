public class Boxing {
	public static void main(String[] args) {
		/***** 手动装箱/拆箱 *****/
		Byte data1 = Byte.valueOf((byte) 10);
		byte d1 = data1.byteValue();

		Short data2 = Short.valueOf((short) 10);
		short d2 = data2.shortValue();

		Integer data3 = Integer.valueOf(10);
		int d3 = data3.intValue();

		Long data4 = Long.valueOf(10L);
		long d4 = data4.longValue();

		Float data5 = Float.valueOf(3.14f);
		float d5 = data5.floatValue();

		Double data6 = Double.valueOf(3.14);
		double d6 = data6.doubleValue();

		Character data7 = Character.valueOf('x');
		char d7 = data7.charValue();

		Boolean data8 = Boolean.valueOf(false);
		boolean d8 = data8.booleanValue();

		/***** 自动装箱/拆箱 *****/
		Integer num = 10;
		int n = num;
	}
}
