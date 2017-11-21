package com.tugas.raihan.c_schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddEventActivity extends AppCompatActivity {

    private EditText inputTitle, inputLocation, inputStart, inputEnd, inputDesc;
    private LinearLayout btnSave, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        initItems();
        initListeners();
    }

    private void initListeners() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initItems() {
        inputTitle = findViewById(R.id.input_event_name);
        inputLocation = findViewById(R.id.input_event_location);
        inputStart = findViewById(R.id.input_event_start);
        inputEnd = findViewById(R.id.input_event_end);
        inputDesc = findViewById(R.id.input_event_description);

        btnSave = findViewById(R.id.event_save);
        btnCancel = findViewById(R.id.event_cancel);
    }
}
