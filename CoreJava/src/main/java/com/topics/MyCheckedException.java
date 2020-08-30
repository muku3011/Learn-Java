package com.topics;

public class MyCheckedException extends Exception {

    ErrorMessageAndCode errorMessageAndCode;

    public MyCheckedException(ErrorMessageAndCode errorMessageAndCode) {
        super();
        this.errorMessageAndCode = errorMessageAndCode;
    }

}
