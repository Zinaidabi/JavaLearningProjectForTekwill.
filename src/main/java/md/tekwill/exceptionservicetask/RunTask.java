package md.tekwill.exceptionservicetask;

public class RunTask {
    public static void main(String[] args) {
        int stringLength = TextManager.getTheTextLengthWithoutTryAndCatch("Sternocleidomastoidian");
        System.out.println(stringLength);

        String data = null;
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch(data));
        System.out.println("I am happy and I know it");

        System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10, 5));
        System.out.println(ArithmeticOperationService.divideDataWithTryAndCatch(10, 0));
        System.out.println("The code is fine, the execution is good");
    }
}
