package md.tekwill.accessandmodifiers;

import md.tekwill.accessandmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person Ion001 = new Person("Ion", "Busuioc", 667443);
        System.out.println(Ion001.ID);
        System.out.println(Ion001.getAge());

        Person Olga001 = new Person("Olga", "Grozavu", 437839, 18, false);
        System.out.println(Olga001.getAge());

        Person person = new Person("Valoare", "Valoare", 782922, 345, true);
        System.out.println(person.getAge());

        Person George = new Person("George", "Cosbuc", 785922, 105, true);
        System.out.println(George.getAge());

        Person Ana = new Person("Ana", "Danuta", 787922, 18, false);
        System.out.println(Ana.getAge());

        if (Ion001.isRetired) {
            System.out.println(Ion001.firstName + " este pensionat");
        } else {
            System.out.println(Ion001.firstName + " nu este pensionat");

        }
        if (Olga001.isRetired) {
            System.out.println(Olga001.firstName + " este pensionat");
        } else {
            System.out.println(Olga001.firstName + " nu este pensionat");

        }
        Olga001.printRetirementStatus();
        person.printRetirementStatus();
        Person.isHuman = false;

    }
}
