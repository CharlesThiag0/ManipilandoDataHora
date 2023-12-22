package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class P07 {
    public static void main(String[] args) {
        // pegar horario em nePal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        System.out.println("Horário atual em Nepal: " + formatter.withZone(ZoneId.of("Europe/London"))
                .format(Instant.now().plus(5, ChronoUnit.HOURS)
                        .plus(45, ChronoUnit.MINUTES))); // UTC de Nepal

        System.out.println("Horário atual em Chipre: " + formatter.withZone(ZoneId.of("Europe/London"))
                .format(Instant.now().plus(2, ChronoUnit.HOURS)));

    }
}
