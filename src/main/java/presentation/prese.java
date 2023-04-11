package presentation;

import ext.DaoImpl2;
import metier.MetierImpl;

public class prese {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();
       // DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Résultat="+metier.calcul());
    }
}
