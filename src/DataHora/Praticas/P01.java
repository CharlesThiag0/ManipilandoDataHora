package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class P01 {
    public static void main(String[] args) {

        DateTimeFormatter horarioFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.printf("Horario GMT/Londres: %s\n", horarioFormato
                .format(ZonedDateTime.now(ZoneId.of("Europe/London"))));
        System.out.println("-----------------------------");
        System.out.printf("Horario em Local: %s", horarioFormato.format(LocalDateTime.now()));
        System.out.println("-----------------------------");

    }
}
