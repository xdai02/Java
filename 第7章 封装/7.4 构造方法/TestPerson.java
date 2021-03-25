public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("小灰", 16);
        System.out.println("我叫" + person.getName() 
                            + "，今年" + person.getAge() + "岁");
    }
}