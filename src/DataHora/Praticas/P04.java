package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P04 {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Data com Tempo: " + dataHoraAtual.format(formatter));
        System.out.println("Data: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataAtual));

        Instant dataHoraLondres = Instant.parse("2023-12-21T09:13:12Z");
        System.out.println(formatter.withZone(ZoneId.systemDefault()).format(dataHoraLondres));

        System.out.println(LocalDateTime.of(2023, 12, 31, 00, 50)
                .format(formatter));

    }
}
