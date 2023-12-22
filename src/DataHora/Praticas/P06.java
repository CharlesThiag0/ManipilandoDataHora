package DataHora.Praticas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        // Crie um programa que imprima o horário atual na sua localidade.
        LocalDateTime horarioLocal = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(formatter.format(horarioLocal));

        // Modifique o programa do exercício 1 para imprimir o horário atual em Londres (UTC).
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));

        // Crie um programa que permita ao usuário digitar uma data e hora em UTC e,
        // em seguida, imprima essa data e hora na sua localidade.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Cidade de origen");
        String origen = sc.next();
        System.out.println("Cidade de destino");
        String destino = sc.next();

        ZonedDateTime origenData = ZonedDateTime.now(ZoneId.of(origen));
        ZonedDateTime destinoData = ZonedDateTime.now(ZoneId.of(destino));
        long diferencaEmHoras = origenData.getHour() - destinoData.getHour();
        long diferencaEmMinutes = origenData.getMinute() - destinoData.getMinute();
        System.out.println("Diferença de horas: " + diferencaEmHoras);
        System.out.println("Diferença de minutos: " + diferencaEmMinutes);*/

        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        LocalDateTime local = LocalDateTime.now();
        long horarioDiferenca = ChronoUnit.HOURS.between(local, newYork );
        System.out.println(horarioDiferenca);



    }
}
