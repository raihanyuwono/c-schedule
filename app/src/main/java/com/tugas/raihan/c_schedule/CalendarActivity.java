package com.tugas.raihan.c_schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {

    private TextView currentMonth;
    private ImageView monthPrev, monthNext;

    private CompactCalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        initItems();
    }

    private void initItems() {
        currentMonth = findViewById(R.id.current_month);
        monthNext = findViewById(R.id.next_month);
        monthPrev = findViewById(R.id.prev_month);
        calendarView = findViewById(R.id.calendar_view);
        calendarView.setFirstDayOfWeek(Calendar.SUNDAY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.calendar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.add_event:
                startActivity(new Intent(this, AddEventActivity.class));
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
