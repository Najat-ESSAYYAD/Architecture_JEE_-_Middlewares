package extension;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("la version capteurs");
        double temp=100;
        return temp;
    }
}
