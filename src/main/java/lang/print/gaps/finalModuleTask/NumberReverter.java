package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void main(String[] args) {
        revert(489);
    }

    public static void revert(int number) {
        int a = number / 100;
        int b = number / 10 - a * 10;
        int c = number - a * 100 - b * 10;

        System.out.println(a + "\n" + b + "\n" + c);
    }
}
