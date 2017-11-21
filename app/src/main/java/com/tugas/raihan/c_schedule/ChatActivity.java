package com.tugas.raihan.c_schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_CHAT;

public class ChatActivity extends AppCompatActivity {

    private EditText message;
    private ImageView send;
    private RecyclerView recyclerChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        initItems();
        initListeners();

    }

    private void initListeners() {
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // SEND MESSAGE
            }
        });
    }

    private void initItems() {
        String title = getIntent().getStringExtra(LABEL_CHAT);
        setTitle(title != null ? title : getString(R.string.app_name));

        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        recyclerChat = findViewById(R.id.recycler_chat);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.home:
                intent = new Intent(this, GroupActivity.class);
                break;
            case R.id.calendar:
                intent = new Intent(this, CalendarActivity.class);
                break;
            default:
                break;
        }

        if (intent != null) startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
}
