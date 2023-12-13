package interfaces;

import java.time.LocalDate;

public interface Renouvelable {
    /**
     * Prolonge le contrat jusqu'à une noouvelle date de fin donnée
     * @param nouvelleDateFin
     */
    public void prolongerContrat(LocalDate nouvelleDateFin);
}
