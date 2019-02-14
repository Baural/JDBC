package com.epam.jdbc.dao.Customer;

import javax.sql.RowSet;
import java.sql.Connection;
import java.util.Collection;

public class MYSQLCustomerDAO implements CustomerDAO {
    @SuppressWarnings("unused")
    private Connection connection = null;
    // create Statement

    public MYSQLCustomerDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int insertCustomer() {
        return 0;
    }

    @Override
    public boolean deleteCustomer() {
        return false;
    }

    @Override
    public Customer findCustomer() {
        return null;
    }

    @Override
    public boolean updateCustomer() {
        return false;
    }

    @Override
    public RowSet selectCustomerRS() {
        return null;
    }

    @Override
    public Collection selectCustomerTO() {
        return null;
    }
}
