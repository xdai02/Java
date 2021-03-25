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
	 * 自定义规则：实现两个对象的等值比较
	 * @param obj - 需要比较的对象
	 * @return 比较的结果：相同true，不同false	
	 */
	@Override
	public boolean equals(Object obj) {
		// 1. 如果两个对象地址相同，返回true
		if(this == obj) {
			return true;
		}
		
		// 2. 如果obj是null，返回false
		if(obj == null) {
			return false;
		}
		
		// 3. 如果两个对象类型不同，返回false
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		// 4. 如果两个对象中的属性全部相同，返回true，否则返回false
		Dog dog = (Dog)obj;
		return this.name.equals(dog.name) 
				&& this.age == dog.age 
				&& this.type.equals(dog.type);
	}
}
