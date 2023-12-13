package heritage;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Salarie michel = new Salarie(
                "Blanc",
                "Michel",
                LocalDate.of(1980,12,31),
                30,
                LocalDate.now()

        );
        Stagiare titouan = new Stagiare(
                "Dupont",
                "L'autre",
                LocalDate.of(1992,12,31),
                LocalDate.of(2020,05,15),
                LocalDate.of(2023,05,15)

        );

        System.out.println(michel);
        System.out.println(titouan);
    }
}
