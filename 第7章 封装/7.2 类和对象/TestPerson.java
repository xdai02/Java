public class TestPerson {
    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.name = "张三";
        zhangsan.age = 18;
        zhangsan.gender = "男";

        Person lisi = new Person();
        lisi.name = "李四";
        lisi.age = 22;
        lisi.gender = "女";

        System.out.println("姓名：" + zhangsan.name 
                            + " 年龄：" + zhangsan.age
                            + " 性别：" + zhangsan.gender);
        System.out.println("姓名：" + lisi.name 
                            + " 年龄：" + lisi.age
                            + " 性别：" + lisi.gender);
        
        zhangsan.eat();
        lisi.sleep();
    }
}
