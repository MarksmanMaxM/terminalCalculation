import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        System.out.println("Введите оператор:");
        String operation = scanner.next();
        System.out.println("Введите второе число:");
        int two = scanner.nextInt();
        int result = 0;

        switch(operation) {
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "/":
                result = one / two;
                break;
            default:
                System.out.println("Думай, что пишешь)))");
        }
        System.out.println("Ответ: " + result);






    }
}