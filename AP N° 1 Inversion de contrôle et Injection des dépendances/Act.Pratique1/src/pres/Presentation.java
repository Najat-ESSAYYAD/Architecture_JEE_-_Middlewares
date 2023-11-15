package pres;

import dao.DaoImpl;
import extension.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        // couplage fort

        // Injection des dépendances par instanciation statique = new

        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("le résultat = "+metier.Calcul());
    }
}
