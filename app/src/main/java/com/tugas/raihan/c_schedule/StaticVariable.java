package com.tugas.raihan.c_schedule;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class StaticVariable {

    public static final String LABEL_CHAT = "GROUP_NAME";
    public static final String LABEL_BTN = "BUTTON";
    public static final String LABEL_TEXT = "TEXT";

    public static final int LABEL_OWN = 0;
    public static final int LABEL_OTHER = 1;

    public static FirebaseAuth firebaseAuth;
    public static FirebaseUser user;

}
