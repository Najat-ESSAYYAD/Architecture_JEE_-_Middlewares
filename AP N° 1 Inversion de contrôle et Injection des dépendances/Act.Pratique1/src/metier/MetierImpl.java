package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    /* couplage faible */
    private IDao dao;
    @Override
    public double Calcul() {
        double temp=dao.getData();
        double res=temp/Math.cos(Math.PI);
        return res;
    }

    /* Injecter dans la variable dao un objet
     d'une classe qui implémente l'interface IDao */

    // L'injection des dépendances
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
