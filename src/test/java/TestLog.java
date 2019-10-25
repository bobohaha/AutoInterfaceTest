import org.apache.log4j.Logger;

public class TestLog {
    public static final Logger log = Logger.getLogger(TestLog.class);
    public static void main(String[] args) {
        log.info("test");
    }
}
