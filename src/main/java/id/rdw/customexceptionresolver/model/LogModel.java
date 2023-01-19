package id.rdw.customexceptionresolver.model;


import java.util.UUID;

public class LogModel {

    public UUID logId;

    public String message;

    public LogModel(String message) {
        this.logId = UUID.randomUUID();
        this.message = message;
    }
}
