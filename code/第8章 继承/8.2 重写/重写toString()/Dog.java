public class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "我叫" + this.name + "，我是一只" + this.type + "。";
	}
}