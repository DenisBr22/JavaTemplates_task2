import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int num = 1;

    private static Logger logger;

    private Logger() {
        this.logger = logger;
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }


    public void log(String msg) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd.MMMM.yyyy HH:mm:ss");
        String textTime = time.format(LocalDateTime.now());
        System.out.println( "[" + textTime + " " + num +  "] " + msg);
        num++;
    }
}