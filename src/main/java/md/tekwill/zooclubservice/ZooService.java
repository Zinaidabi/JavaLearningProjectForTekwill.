package md.tekwill.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat("Cleo", 5);
        Dog dog1 = new Dog("Rex", 4);
        Monkey monkey1 = new Monkey("Ceburashka", 2);

        System.out.println(monkey1.getAge());
        monkey1.makeSound();
        cat001.makeSound();
        System.out.println(cat001.getName());

    }
}
