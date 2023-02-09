// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {

        System.out.println("Привет! Это программа для калькуляции счёта. \nНа скольких человек необходимо разделить счёт?");

        int numberOfPeople;
        Scanner scanner = new Scanner(System.in);

            while(true) {
                // проверяем на целое число
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не похоже на целое число :( Пожалуйста, введите целое число.");
                    scanner.next();
                }
                numberOfPeople = scanner.nextInt();
                // проверяем на другие возможные некорректные вводы и если всё ок, то запускаем метод calc, передав ему количество друзей
                if (numberOfPeople == 1) {
                    System.out.println("Для одного человека нет необходимости разделять счёт, попробуйте ещё раз :)");
                } else if (numberOfPeople < 1) {
                    System.out.println("Вы ввели значение меньше 1. Это некорректное значение, попробуйте ещё раз :(");
                } else {
                    System.out.println("Ок! Произведём расчёт для " + numberOfPeople + " человек.");
                    System.out.println("Сначала создадим список товаров! Когда список будет полным, введите \"Завершить\".\n");
                    calculator.calc(numberOfPeople);
                    break;
                }
            }
    }
}
