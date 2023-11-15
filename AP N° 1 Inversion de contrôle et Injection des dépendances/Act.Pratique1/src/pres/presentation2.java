package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine(); // connaitre le nom de la classe
        Class cDao=Class.forName(daoClassName); // charger la classe au mémoire
        IDao dao= (IDao) cDao.newInstance(); // instancier la clasee ou créer l'objet

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        //   metier.setDao(dao)
        method.invoke(metier,dao);
        System.out.println("le résultat= "+metier.Calcul());

    }
}
