package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        calculateSum(4895);
    }
    public static void calculateSum(int number) {
        int a = number / 1000 ;
        int b = number / 100 - a * 10;
        int c = number / 10 - a * 100 - b * 10;
        int d = number - a * 1000 - b * 100 - c * 10 ;

                System.out.println(a + b + c + d);
    }

}
