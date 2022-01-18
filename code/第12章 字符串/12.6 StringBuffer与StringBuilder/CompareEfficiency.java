public class CompareEfficiency {
	public static void main(String[] args) {
		final int CNT = 100000;
		
		String str = new String();
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		long start, end;
		
		// Stringƴ��
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			str += i;
		}
		end = System.currentTimeMillis();
		System.out.println("Stringƴ�ӣ�" + (end - start));
		
		// StringBufferƴ��
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			stringBuffer.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBufferƴ�ӣ�" + (end - start));
		
		// StringBuilderƴ��
		start = System.currentTimeMillis();
		for(int i = 0; i < CNT; i++) {
			stringBuilder.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilderƴ�ӣ�" + (end - start));
	}
}
