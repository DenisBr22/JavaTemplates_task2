import java.util.*;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log( "Запуск программы" );

        Scanner scanner = new Scanner(System.in);
        logger.log( "Просим пользователя ввести входные данные для списка" );
        System.out.println("Доброго дня \nВведите размер списка:");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxvalue = scanner.nextInt();

        logger.log( "Создаём список" );
        Random random = new Random();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            value.add(random.nextInt(maxvalue));
        }
        System.out.println("Вот случайный список: " + value.toString());
        logger.log( "Просим пользователя ввести входные данные для фильтрации" );
        System.out.println("Введите порог для фильтра:");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        logger.log( "Запускаем фильтрацию" );
        filter.filterOut(value);
        logger.log("Завершаем программу");
    }
}