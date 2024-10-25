package md.tekwill.operationsandciclicfunctions;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        int d = a--;
        System.out.println("a = " + a);
        System.out.println("d = " + d);

        int e = --a;
        System.out.println("a = " + a);
        System.out.println("e = " + e);

    }
}
