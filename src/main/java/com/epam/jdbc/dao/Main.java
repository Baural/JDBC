package com.epam.jdbc.dao;


import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = null;
        try {
            ConnectionPool.init();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        pool = ConnectionPool.getInstance();

        DAOFactory mySQLFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        if(mySQLFactory instanceof MYSQLDAOFactory){
            MYSQLDAOFactory my = (MYSQLDAOFactory)mySQLFactory;
            my.setConnectionPool(pool);
        }

        CustomerDAO custDAO=null;
        try {
            custDAO = mySQLFactory.getCustomerDAO();
        } catch (CannotTakeConnectionException e) {
            e.printStackTrace();
        }

        int newCustNo = newCustNo = custDAO.insertCustomer();
    }
}
