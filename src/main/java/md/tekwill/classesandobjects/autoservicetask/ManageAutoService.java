package md.tekwill.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Car car0001 = new Car("", "Audi", "Black");
        Car car0002 = new Car("508", "Peugeot", "Gray");

        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color + " " + car0002.plateNumber);

        Car car0003 = new Car("BMW", "X5", "white", "BOS 01", 65486);
        Car car0004 = new Car("BMW", "X5", "white", "BOS 02", 65886);

        Tool tool0001 = new Tool("Hammer", 2);
        System.out.println("The name of te tool is " + tool0001.name + " and its weight is " + tool0001.weight);

        Garage garage0001 = new Garage();
        System.out.println(garage0001.name + " on address:" + garage0001.address);
        garage0001.name = "Auto-Detailing";
        System.out.println(garage0001.name + " on address:" + garage0001.address);
        garage0001.address = " Stefan cel mare 150";
        System.out.println(garage0001.name + " on address:" + garage0001.address);

        Worker worker001 = new Worker();
        System.out.println(worker001.name);
        worker001.name = "George";
        worker001.age = 18;
        worker001.salary = 5;
        System.out.println(worker001.name);
        System.out.println(worker001.age);
        System.out.println(garage0001.name);


    }
}

