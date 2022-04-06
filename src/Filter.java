import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer i : source) {
            if (i > treshold) {
                result.add(i);
                logger.log("Элемент " + i + " проходит");
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        System.out.println("В список попало " + result.size() + " элементов из " + source.size());
        System.out.println("Отфильтрованнный список " + result.toString());
        return result;
    }
}