public class TestPerson {
    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.name = "����";
        zhangsan.age = 18;
        zhangsan.gender = "��";

        Person lisi = new Person();
        lisi.name = "����";
        lisi.age = 22;
        lisi.gender = "Ů";

        System.out.println("������" + zhangsan.name 
                            + " ���䣺" + zhangsan.age
                            + " �Ա�" + zhangsan.gender);
        System.out.println("������" + lisi.name 
                            + " ���䣺" + lisi.age
                            + " �Ա�" + lisi.gender);
        
        zhangsan.eat();
        lisi.sleep();
    }
}
