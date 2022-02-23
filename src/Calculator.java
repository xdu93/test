import java.util.Scanner;

public class Calculator {
    //Калькулятор
    public static void main(String[] args) {

        int result = 0;
        int operand1 = firstOperand();
        char operation = InputOperation.check();

        while (operation != 's') {
            if (operation == 'c') {
                result = 0;
                System.out.println("Результат: " + result);
                operand1 = firstOperand();
                operation = InputOperation.check();
            } else {
                int operand2 = secondOperand();

                switch (operation) {
                    case '+':
                        result += Operations.sum(operand1, operand2);
                        operand1 = result;
                        System.out.println("Результат: " + result);
                        result = 0;
                        break;
                    case '-':
                        result += Operations.minus(operand1, operand2);
                        operand1 = result;
                        System.out.println("Результат: " + result);
                        result = 0;
                        break;
                    case '*':
                        result += Operations.multi(operand1, operand2);
                        operand1 = result;
                        System.out.println("Результат: " + result);
                        result = 0;
                        break;
                    case '/':
                        result += Operations.del(operand1, operand2);
                        operand1 = result;
                        System.out.println("Результат: " + result);
                        result = 0;
                        break;
                }
                operation = InputOperation.check();
            }
        }
    }

    private static int firstOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  первый аргумент - целое число");
        int first = scanner.nextInt();
        return first;
    }

    private static int secondOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите следующий аргумент - целое число");
        System.out.println("second commit");
        System.out.println("second commit");
        int second = scanner.nextInt();
        return second;
    }
}