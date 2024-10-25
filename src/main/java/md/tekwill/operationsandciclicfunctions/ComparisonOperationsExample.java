package md.tekwill.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        boolean isNotEqual = a!= b;
        System.out.println("Diferit de: " + isNotEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decit: " + isGreaterThan);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decit: " + isLessThan);

        boolean isGreaterThanEqual = a >= b;
        System.out.println("Mai mare sau egal decit: " + isGreaterThanEqual);

        boolean isLessThanEqual = a <= b;
        System.out.println("Mai mic sau egal decit: " + isLessThanEqual);
    }
}

