package md.tekwill.zooclubservice;

public class Monkey extends Animal {

    public Monkey(String name, int age){
        super(name, age);

    }

    @Override
    public void eat() {
        System.out.println("Bananas from Bahamas");
    }

    @Override
    public void makeSound() {
        System.out.println("Uhh-Uhh Ahh-Ahh");
    }
}
