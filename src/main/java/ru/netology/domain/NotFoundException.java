package ru.netology.domain;

public class NotFoundException extends RuntimeException {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NotFoundException(int id) {
        this.id = id;
    }

    public NotFoundException(String message, int id) {
        super(message);
        this.id = id;
    }

    public NotFoundException(String message, Throwable cause, int id) {
        super(message, cause);
        this.id = id;
    }

    public NotFoundException(Throwable cause, int id) {
        super(cause);
        this.id = id;
    }

    public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int id) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.id = id;
    }

}
