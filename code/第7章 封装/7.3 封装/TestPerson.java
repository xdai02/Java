public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ğ¡»Ò");
        person.setAge(17);
        System.out.println("ĞÕÃû£º" + person.getName());
		System.out.println("ÄêÁä£º" + person.getAge());
    }
}
