package creational.singleton;

// Q1. simple singleton design pattern

public class Logger {

    private static Logger instance;
    private final String filename;
    private static int count=0;


    private Logger(String filename) {
        this.filename = filename;
    }

    public static synchronized Logger getInstance(){
        if (instance == null) {
            instance = new Logger("abc.txt");
            count++;
        }
        return instance;
    }

    public String getName(){
        return "Kate Elizabeth wilson " + count;
    }

}



