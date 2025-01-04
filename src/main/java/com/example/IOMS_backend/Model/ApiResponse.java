package com.example.IOMS_backend.Model;

public class ApiResponse {

    private int Statuscode;
    private String message;
    private String value;

    public ApiResponse(int Statuscode, String message, String value) {
        this.Statuscode = Statuscode;
        this.message = message;
        this.value = value;
    }

    public int getStatuscode() {
        return Statuscode;
    }

    public void setStatuscode(int statuscode) {
        Statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "Statuscode=" + Statuscode +
                ", message='" + message + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
