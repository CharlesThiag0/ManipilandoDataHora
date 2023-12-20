package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P03 {
    public static void main(String[] args) {
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.parse("2023-12-01");
        System.out.println(formato01.format(localDate));
        System.out.println(localDate1.format(formato01));

        DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH-mm");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.parse("2024-12-12T01:30:12");
        System.out.println(formato02.format(localDateTime));
        System.out.println(localDateTime1.format(formato02));

        Instant instant = Instant.now();
        System.out.println(formato02.withZone(ZoneId.systemDefault()).format(instant));
        System.out.println(formato02.withZone(ZoneId.of("Portugal")).format(instant));
        System.out.println(formato02.withZone(ZoneId.of("Africa/Harare")).format(instant));

        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());

    }
}
