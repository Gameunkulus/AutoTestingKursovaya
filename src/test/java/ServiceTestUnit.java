import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceTestUnit {

    @BeforeAll
    static void {

    }

    private String generateDate(int addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }
}
