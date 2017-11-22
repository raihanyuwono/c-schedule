package com.tugas.raihan.c_schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.tugas.raihan.c_schedule.adapter.MessageAdapter;
import com.tugas.raihan.c_schedule.data.MessageData;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_CHAT;
import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_OTHER;
import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_OWN;
import static com.tugas.raihan.c_schedule.StaticVariable.user;

public class ChatActivity extends AppCompatActivity {

    private EditText message;
    private ImageView send;
    private RecyclerView recyclerChat;

    private List<MessageData> listMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        initItems();
        initListeners();
        loadItems();

    }

    private void loadItems() {
        recyclerChat.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListeners() {
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO DO change to firebase
                String mess = message.getText().toString();
                message.setText("");
                listMessage.add(new MessageData(LABEL_OWN, mess));
                updateMessage();
            }
        });
    }

    private void updateMessage() {
        listMessage.add(new MessageData(LABEL_OTHER, "Oi"));
        MessageAdapter adapter = new MessageAdapter(listMessage);
        recyclerChat.setAdapter(adapter);
        recyclerChat.scrollToPosition(listMessage.size() - 1);
    }

    private void initItems() {
        String title = getIntent().getStringExtra(LABEL_CHAT);
        setTitle(title != null ? title : getString(R.string.app_name));

        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        recyclerChat = findViewById(R.id.recycler_chat);

        listMessage = new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);
//        String regex = "user[*]+";
//        Pattern p = Pattern.compile(regex);
//        Matcher matcher = p.matcher((getIntent().getStringExtra(LABEL_CHAT)));

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
