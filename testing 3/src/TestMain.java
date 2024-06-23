import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestMain {
    @Test
    public void testFormattedDate() {
        String dateTimeString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);

        String formattedDate = offsetDateTime.format(formatter);

        assertEquals("01 marzo 2023", formattedDate);
    }
}