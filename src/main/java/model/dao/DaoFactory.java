package model.dao;

import conn.Db;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    /*
        É uma forma da minha classe expor um método que retorna o tipo da interface, mas internamente ela está
        instanciando uma implementacao. É uma forma de não expor a implementação, mostrando apenas a interface, ou seja,
        o programa não conhece a implementação, apenas a interface
     */
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(Db.getConnection());
    }
}
