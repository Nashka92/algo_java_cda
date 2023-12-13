package heritage;

import java.time.LocalDate;

public class Stagiare extends Personne {

    private LocalDate debutStage;
    private LocalDate finStage;

    public Stagiare(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutStage,
            LocalDate finStage
    ) {
        super(nom, prenom, dateNaissance);
        this.debutStage = debutStage;
        this.finStage = finStage;
    }

    public LocalDate getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() {
        return finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    // methodes
    public void travailler() {
        System.out.println(this.nom + " " + this.prenom + " travaille en tant que stagiaire :).");
    }


    public void licencier(LocalDate finStage) {
        this.finStage = finStage;
        System.out.println(this.nom + " " + this.prenom + " a terminé son stage le " + finStage);
    }
    @Override
    public String toString(){
        return "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom;
    }
}
