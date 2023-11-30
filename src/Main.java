import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Напишите калькулятор 1 методом.
        // Метод должен принимать 2 цифровых значения и арифметический знак.
        // Возвращать он должен ответ.
        Oper oper = (int a, int b, char symbol) ->{
            switch (symbol){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                case '%':
                    System.out.println(a%b);
                    break;
                default:
                    System.out.println("Некоректный воод данных!");
                    break;

            }
        };
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char symbol = scanner.next().charAt(0);

        oper.calculate(a,b,symbol);

    }
}