package com.tugas.raihan.c_schedule.data;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class ChatListData {

    private int photo;
    private String name, lastMessage;

    public ChatListData(int photo, String name, String lastMessage) {
        this.photo = photo;
        this.name = name;
        this.lastMessage = lastMessage;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

}
