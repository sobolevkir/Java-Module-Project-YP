// Данный класс предназначен для хранения списка товаров и их суммарной стоимости

public class ProductHolder {

    String names = ""; // Имена
    double costs = 0.00; // Цены

    // Добавление товара в список и подсчёт суммы
    void addNewProduct(String newProductName, double newProductCost) {
        names += newProductName + '\n';
        costs += newProductCost;
    }

}
