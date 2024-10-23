package day23_localTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate); // 2024-10-23

        System.out.println(localDate.getDayOfYear()); // 297

        System.out.println(localDate.getDayOfWeek()); // WEDNESDAY

        System.out.println(localDate.getChronology()); // ISO

        // with()
        System.out.println(localDate.withMonth(5)); // 2024-05-23

        // plus(), minus(
        System.out.println(localDate.plusWeeks(34).plusDays(11)); // 2025-06-29

        System.out.println(localDate.minusMonths(15).minusDays(13));


        // 1903 leap year (artik yil) mi
        LocalDate tarih = LocalDate.of(1903, 1, 1);

        System.out.println(tarih.isLeapYear()); // false

    }

}
