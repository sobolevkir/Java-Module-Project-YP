import java.util.Scanner;

public class Calculator {
    ProductHolder productHolder = new ProductHolder();
    Formatter formatter = new Formatter();
    double newProductCost;
    String newProductName;
    double amountPerPerson;
    String rubEnding;

    void calc (int numberOfPeople) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите наименование товара:");
            newProductName = scanner.nextLine();
            if (newProductName.equalsIgnoreCase("Завершить")) {
                System.out.println("\nСоздание списка завершено!");
                System.out.println("Добавленные товары: \n----------\n" + productHolder.names + "----------");
                rubEnding = formatter.getEnding(productHolder.costs);
                System.out.printf("Общая стоимость товаров: %.2f %s.\n", productHolder.costs, rubEnding);
                amountPerPerson = productHolder.costs / numberOfPeople;
                rubEnding = formatter.getEnding(amountPerPerson);
                System.out.printf("Каждый должен заплатить: %.2f %s.", amountPerPerson, rubEnding);
                break;
            } else if (newProductName.equals("")) {
                System.out.println("Вы ничего не ввели. Попробуйте ещё раз.");
            } else {
                System.out.println("Введите стоимость товара в рублях:");
                while(true) {
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Это не похоже на число :( Пожалуйста, введите корректную сумму.");
                        scanner.next();
                    }
                    newProductCost = scanner.nextDouble();
                    if (newProductCost > 0) {
                        productHolder.addNewProduct(newProductName, newProductCost);
                        System.out.println("Товар успешно добавлен. Добавим ещё?");
                        break;
                    } else {
                        System.out.println("Вы ввели отрицательное число, введите положительное!");
                    }
                }
            }
        }

    }

}
