package com.epam.jdbc.dao.DAOFactory;

import com.epam.jdbc.dao.Customer.CustomerDAO;
import com.epam.jdbc.dao.Customer.MYSQLCustomerDAO;
import com.epam.jdbc.dao.Exception.CannotTakeConnectionException;

import java.sql.Connection;

public class MYSQLDAOFactory extends DAOFactory {
    private static ConnectionPool pool = null;

    public void setConnectionPool(ConnectionPool pool){
        MYSQLDAOFactory.pool = pool;
    }

    private static synchronized Connection createConnection(){
        Connection con = null;
        try {
            con = pool.takeConnection();
        } finally {
            // logger
        }
        return con;
    }

    public CustomerDAO getCustomerDAO() throws CannotTakeConnectionException{
        Connection con = createConnection();
        if (con == null){
            throw new CannotTakeConnectionException();
        }
        return new MYSQLCustomerDAO(con);
    }
}
