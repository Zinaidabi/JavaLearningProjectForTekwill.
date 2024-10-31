package md.tekwill.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        Customer customer001 = new Customer();
        customer001.setName("Gabriel");
        customer001.setEmail(DataGeneratorUtil.getRandomEmail("gabriel+", "@gmail.com"));
        customer001.setAge(DataGeneratorUtil.getRandomInt(18, 100));

//        System.out.println(customer001.getName());
//        System.out.println(customer001.getEmail());
//        System.out.println(customer001.getAge());

        System.out.println(customer001.getTheObjectInformation());

        Customer customer002 = new Customer("Virgil", DataGeneratorUtil.getRandomEmail("Virgil+", "@gmail.com"), DataGeneratorUtil.getRandomInt(18, 100));
        System.out.println(customer002.getTheObjectInformation());

        System.out.println(DataGeneratorUtil.getRandomInt(18));
        System.out.println(DataGeneratorUtil.getRandomEmail("@gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("Victor+", "@gmail.com"));
    }
}

