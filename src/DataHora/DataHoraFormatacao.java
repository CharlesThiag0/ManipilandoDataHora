package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraFormatacao {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // ñ criar um obj por ser estaticos
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate));
        // ofPattern cria um formato para a hora "customiza"

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(formato1.format(localDateTime));

        Instant instant = Instant.now();
        System.out.println(formato1.withZone(ZoneId.systemDefault()).format(instant));
        // Formatar o texto Instant será obrigatorio uma Zona para que possa ser calculado
        // baseado no fuso-horario

    }
}
