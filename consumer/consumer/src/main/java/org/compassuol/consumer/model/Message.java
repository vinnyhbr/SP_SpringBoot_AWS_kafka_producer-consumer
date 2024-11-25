package org.compassuol.consumer.model;

public class Message {
    private String id;
    private String status;

    public Message() {}

    public Message(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

