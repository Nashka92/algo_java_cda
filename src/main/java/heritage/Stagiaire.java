package heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutContrat,
            LocalDate finContrat
    ) {
        super(  nom,
                prenom,
                dateNaissance,
                debutContrat,
                finContrat
        );
    }

    /**
     * Indique ce que fait le stagiaire.
     */
    @Override
    public void travailler() {
        System.out.println(this.nom + this.prenom + " casse la prod");
    }

    @Override
    public void danser(String danse) {
        System.out.println("Le stagiaire danse: " + danse );
    }

    /**
     * Mets fin prématurément au stage
     */

    public int getDureeStage() {
        return Period.between(this.debutContrat, this.finContrat).getDays();
    }
}
