package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MainLocalDate {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date = LocalDate.now();
        LocalDateTime date1 = LocalDateTime.now();
        Instant instant = Instant.now();
        LocalDate date2 = LocalDate.parse("2024-07-20");
        LocalDateTime dateTime = LocalDateTime.parse("2024-07-20T01:30:26");
        Instant instant1 = Instant.parse("2024-07-20T01:30:26Z");
        Instant instant2 = Instant.parse("2024-07-20T01:30:26-03:00");
        LocalDate date3 = LocalDate.parse("20/06/2024", fmt1);
        LocalDateTime dateTime1 = LocalDateTime.parse("20/01/2024 05:26", fmt2);

        LocalDate date4 = LocalDate.ofInstant(instant1, ZoneId.systemDefault());
        LocalDate date5 = LocalDate.ofInstant(instant1, ZoneId.of("Portugal"));

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(dateTime);
        System.out.println(dateTime1);
        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(fmt1);
        System.out.println(fmt2);

    }

}
