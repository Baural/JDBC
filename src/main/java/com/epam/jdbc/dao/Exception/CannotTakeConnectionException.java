package com.epam.jdbc.dao.Exception;

public class CannotTakeConnectionException extends Exception {
    public CannotTakeConnectionException() {
        super();
    }

    public CannotTakeConnectionException(String msg) {
        super(msg);
    }
}
