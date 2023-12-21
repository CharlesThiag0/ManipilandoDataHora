package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculosData {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Instant instant = Instant.now();

        // decremento e incremento
        System.out.println(localDateTime.minusHours(5).format(formato));
        System.out.println(localDateTime.plusHours(10));
        System.out.println(LocalDateTime.now().minusMonths(6)); // direto
        System.out.println(LocalDateTime.now().plusMonths(3)); // direto
        // decremento e incremento em horario GMT
        System.out.println(instant.plus(1, ChronoUnit.DAYS));
        System.out.println(instant.minus(21, ChronoUnit.DAYS));
        System.out.println(instant.minus(2, ChronoUnit.DAYS));

        // Saber a duração EM TEMPO
        System.out.println(Duration.between(instant, Instant.parse("2023-12-21T06:00:33Z")));
        System.out.println(Duration.between(LocalDateTime.parse("2023-12-22T06:00:33"), localDateTime));

    }
}
