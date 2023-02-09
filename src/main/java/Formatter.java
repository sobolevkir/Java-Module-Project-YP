// Данный класс содержит метод для возвращения строкового значения рубля в нужном падеже
public class Formatter {

    String costs;

    public String getEnding(double costs) {
        int num = (int) Math.floor(costs);
        if (num % 100 / 10 == 1)
        {
            return "рублей";
        }

        switch (num % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

}
