package com.tugas.raihan.c_schedule.data;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class FriendListData {
    private int photo;
    private String username;

    public FriendListData(int photo, String username) {
        this.photo = photo;
        this.username = username;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
