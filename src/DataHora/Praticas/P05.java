package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class P05 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        // formato witchZone ZoneId format
        System.out.println(DateTimeFormatter.ofPattern("dd;;MM;;yyyy HH--mm")
                .withZone(ZoneId.of("Portugal"))
                .format(Instant.parse("2000-12-21T01:01:30Z")));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm");

        System.out.println(formatter.format(Instant.parse("2000-12-01T01:40:12Z").plus(2, ChronoUnit.WEEKS)));

        System.out.println(LocalDateTime.now().format(formatter));

        System.out.println(LocalDateTime.now().minusHours(2));
        System.out.println(LocalDateTime.now().plusMonths(2));

        System.out.println(Instant.parse("2000-01-21T01:50:12Z").minus(10, ChronoUnit.DAYS));



    }
}
