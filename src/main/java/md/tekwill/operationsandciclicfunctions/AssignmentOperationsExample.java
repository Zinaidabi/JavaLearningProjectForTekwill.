package md.tekwill.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;

        int c = a;
        System.out.println("Atribuire simpla: " + c);

        a += c;
        // a = a + c;
        System.out.println("Atribuire cu adunare: " + a);

        a -= b;
        // a = a - b;
        System.out.println("Atribuire cu scadere: " + a);

        a *= c;
        // a = a * c;
        System.out.println("Atribuire cu inmultire: " + a);

        a /= a;
        // a = a \ a;
        System.out.println("Atribuire prin impartire: " + a);

        a %= b;
        // a = a % b;
        System.out.println("Atribuire cu restul impartirii: " + a);

    }

}
