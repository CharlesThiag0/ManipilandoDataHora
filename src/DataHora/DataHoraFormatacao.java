package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraFormatacao {
    public static void main(String[] args) {
      LocalDate localDate = LocalDate.now();
      LocalDateTime localDateTime = LocalDateTime.now();
      Instant instant = Instant.now();

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH,mm").format(localDateTime));
        // Formatar o texto Instant será obrigatorio uma Zona para que possa ser calculado
        // baseado no fuso-horario
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault()).format(instant));

    }
}
