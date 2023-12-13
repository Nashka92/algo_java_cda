@startuml

interface Personne {
getAge(): int
getNom(): String
getPrenom(): String
getNomComplet(): String
}

abstract class Collaborateur implements Personne {
dateDebut : LocalDate
dateFin : LocalDate
licencier()
estDanslesEffectifs()

}

class CDI extends Collaborateur implements Renumerable {


}


class CDD extends Collaborateur implements Renumerable, Renouvelable {


}

class Stagiaire extends Collaborateur, Renouvelable {


}

interface Renumerable {
+payer(heure: int = 151): void
+getTauxHoraire(): double
-calculerRenumerationHeuresSup(double heures): double
}

interface Renouvelable{
+prolongerContrat(LocalDate dateFin): void
}



@enduml