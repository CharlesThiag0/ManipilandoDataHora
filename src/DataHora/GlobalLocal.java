package DataHora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GlobalLocal {
    public static void main(String[] args) {
        // criação do horario gtm e local
        Instant instant = Instant.parse("2024-01-01T01:30:45Z");
        LocalDateTime localDateTime = LocalDateTime.now();
        //formato custom
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd//MM//yyyy HH,mm");
        //tranforma hora global em hora local
        System.out.printf("Horario Local: %s\n", formato.withZone(ZoneId.systemDefault()).format(instant));
        // tranforma hora global em hora da egito
        System.out.printf("Horario em Egito: %s\n", formato.withZone(ZoneId.of("Egypt"))
                .format(instant));
        //tranforma hora global em hora de portugal
        System.out.printf("Horario em Portugal: %s\n", formato.withZone(ZoneId.of("Portugal"))
                .format(instant));
        // pegar dia mes ano hora e minutos
        System.out.printf("Minutos: %s\n", localDateTime.getMinute());
        System.out.printf("Horas: %s\n", localDateTime.getHour());
        System.out.printf("Dia: %s\n", localDateTime.getDayOfMonth());
        System.out.printf("Mês: %s\n", localDateTime.getMonthValue());
        System.out.printf("Ano: %s\n", localDateTime.getYear());

    }
}
