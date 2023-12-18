package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        // Pegando data local do sistema "now = agora"
        LocalDate localDate01 = LocalDate.now(); // Data
        System.out.printf("LocalDate01- %s\n", localDate01);
        LocalDateTime localDateTime01 = LocalDateTime.now(); // Data e Hora
        System.out.printf("LocalDateTime01- %s\n", localDateTime01);
        Instant instant01 = Instant.now();// Horario em GMT/UTC = Horario em londres
        System.out.printf("Instant01- %s\n", instant01);



    }
}
