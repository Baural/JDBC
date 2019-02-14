package com.epam.jdbc.dao.DAOFactory;

import com.epam.jdbc.dao.Customer.CustomerDAO;
import com.epam.jdbc.dao.Exception.CannotTakeConnectionException;

public abstract class DAOFactory {
    public static final int MYSQL =1;

    public abstract CustomerDAO getCustomerDAO() throws CannotTakeConnectionException;

    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){
            case MYSQL :
                return new MYSQLDAOFactory();
                default:
                    return null;

        }
    }
}
