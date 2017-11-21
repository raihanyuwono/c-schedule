package com.tugas.raihan.c_schedule.data;

/**
 * Created by raihanyuwono on 11/22/17.
 */

public class MessageData {

    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageData(int id, String message) {

        this.id = id;
        this.message = message;
    }
}
