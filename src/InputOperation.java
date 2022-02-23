import java.util.Scanner;

public class InputOperation {
    //Проверка корректности введенной операции
    public static char check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемую операцию: + = сумма; - = вычитание; / = деление; * = умножение; с = очистить значения; s = закончить вычисления ");
        char operation = scanner.next().charAt(0);

        while ((operation != '+') && (operation != '-') && (operation != '*') && (operation != '/') && (operation != 'c') && (operation != 's')) {
            System.out.println("Введена неизвестная операция, попробуйте еще раз");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }
}
