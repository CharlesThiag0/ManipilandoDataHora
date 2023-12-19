package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P02 {
    public static void main(String[] args) {

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        DateTimeFormatter  custom2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate localDate = LocalDate.now();
        System.out.println(custom.format(localDate));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(custom2.format(localDateTime));
        Instant instant = Instant.now();
        System.out.println(custom2.withZone(ZoneId.systemDefault()).format(instant));

    }
}
