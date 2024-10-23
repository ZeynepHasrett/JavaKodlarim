package day23_localTime_varargs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class C04_Periyod {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1998, 9, 14);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P26Y1M9D

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); // 26

    }

}
