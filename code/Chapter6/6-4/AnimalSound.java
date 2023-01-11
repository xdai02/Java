public class AnimalSound {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog's sound: " + dog.sound());
        System.out.println("Cat's sound: " + cat.sound());
    }
}
