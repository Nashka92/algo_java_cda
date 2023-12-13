@startuml

class Zoo {

}

class Animal {
+nom : string
+genre : string
+nomScientifique : string
+manger()
+dormir()
+pousserCri()
}

class Mammifere extends Animal {
+accoucher()
}

class Ovipare extends Mammifere {
+pondreOeufs()
}

class Lion extends Mammifere {
+rugir()
+chasser()
+marcherCourir()
}

class Dauphin extends Mammifere {
+siffler()
+nager()
}

class Ornithorynque extends Ovipare {
+grogner()
+marcherNager()
+allaiter()
}


@enduml