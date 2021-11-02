public class CompareEfficiency {
	public static void main(String[] args) {
		final int CNT = 100000;
		
		String str = new String();
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		long start, end;
		
		// String拼接
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			str += i;
		}
		end = System.currentTimeMillis();
		System.out.println("String拼接：" + (end - start));
		
		// StringBuffer拼接
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			stringBuffer.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer拼接：" + (end - start));
		
		// StringBuilder拼接
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			stringBuilder.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder拼接：" + (end - start));
	}
}
