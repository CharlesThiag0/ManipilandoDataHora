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

        System.out.println("--------------------------------------");

        // Texto ISO 8601 (parse)
        LocalDate localDate02 = LocalDate.parse("2023-12-18");
        System.out.printf("LocalDate02- %s\n",localDate02);
        LocalDateTime localDateTime02 = LocalDateTime.parse("2023-12-18T05:52:33");
        System.out.printf("LocalDateTime02- %s\n", localDateTime02);
        Instant instant02 = Instant.parse("2023-12-18T05:52:33Z");
        System.out.printf("Instant02- %s\n", instant02);
        Instant instantZulu = Instant.parse("2023-12-18T05:52:33-03:00");
        System.out.printf("InstantZulu- %s\n", instantZulu); // soma ou subtração da hora

        System.out.println("--------------------------------------");

        // Maneira customizada "Formatter = formatada"
        LocalDate custom01 = LocalDate.parse("18-12-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.printf("Teste de customização- %s\n",custom01);
        LocalDateTime custom02 = LocalDateTime.parse("18-12-2023 06:01", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.printf("Teste de customização- %s\n",custom02);

        System.out.println("--------------------------------------");

        // Instanciação com construtores
        LocalDate localDate03 = LocalDate.of(2023, 12, 18);
        System.out.println("Instaciação com construtores- " + localDate03);
        LocalDateTime localDateTime03 = LocalDateTime.of(2023, 12, 18, 06, 06);
        System.out.println("Instaciação com construtores- " + localDateTime03);

    }
}
