package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalLocal {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2023-12-31T01:30:26Z");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(LocalDate.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println(LocalDate.ofInstant(instant, ZoneId.of("Portugal")));

        System.out.println(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(instant, ZoneId.of("Portugal")));

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());

    }
}
