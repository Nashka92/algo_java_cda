package polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Carre michel = new Carre(2);
        TriangleRectangle robert = new TriangleRectangle(3,3);
        Cercle andre = new Cercle(5);

        // créer une liste de tableau avec tout mes objets
        //
        List<Forme> mesSuperListeDeFormes = new ArrayList<>();
        mesSuperListeDeFormes.add(michel);
        mesSuperListeDeFormes.add(robert);
        mesSuperListeDeFormes.add(andre);

        //parcours mon tableau list
        for (Forme forme: mesSuperListeDeFormes){
            System.out.println("L'aire est de: "+ forme.getAire());
        }
    }
}
