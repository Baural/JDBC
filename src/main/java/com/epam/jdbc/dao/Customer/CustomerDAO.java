package com.epam.jdbc.dao.Customer;

import javax.sql.RowSet;
import java.util.Collection;

public interface CustomerDAO {
    public int insertCustomer();
    public boolean deleteCustomer();
    public Customer findCustomer();
    public boolean updateCustomer();
    public RowSet selectCustomerRS();
    @SuppressWarnings("rawtypes")
    public Collection selectCustomerTO();

}
