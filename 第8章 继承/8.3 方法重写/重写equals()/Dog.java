public class Dog {
	private String name;
	private int age;
	private String type;

	public Dog(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	/**
	 * �Զ������ʵ����������ĵ�ֵ�Ƚ�
	 * @param obj - ��Ҫ�ȽϵĶ���
	 * @return �ȽϵĽ������ͬtrue����ͬfalse	
	 */
	@Override
	public boolean equals(Object obj) {
		// 1. ������������ַ��ͬ������true
		if(this == obj) {
			return true;
		}
		
		// 2. ���obj��null������false
		if(obj == null) {
			return false;
		}
		
		// 3. ��������������Ͳ�ͬ������false
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		// 4. ������������е�����ȫ����ͬ������true�����򷵻�false
		Dog dog = (Dog)obj;
		return this.name.equals(dog.name) 
				&& this.age == dog.age 
				&& this.type.equals(dog.type);
	}
}
