import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a = in.nextInt();
        System.out.println("Введіть друге число");
        int b = in.nextInt();
        System.out.println("Введіть знак операції");
        String s = in.next();
        float res = 0;

        switch (s){
            case "+":
                res  = add(a,b);
                break;
            case "-":
                res  = sub(a,b);
                break;

            default:
                break;
        }
        System.out.printf("Результат операції a %1$s b = %2$s ", s, res);

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
}