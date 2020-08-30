package com.topics;

public enum ErrorMessageAndCode {

    APARTMENT_NOT_FOUND("Apartment not found", 100, "Not available"),
    APARTMENT_NOT_AVAILABLE("Apartment not found", 101, "Not available"),
    APARTMENT_ALREADY_SOLD("Apartment not found", 102, "Not available"),
    INTERNAL_ERROR("Apartment not found", 103, "Not available");

    private String message;
    private int errorCode;
    private String description;

    ErrorMessageAndCode(String message, int errorCode, String description) {
        this.message = message;
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
