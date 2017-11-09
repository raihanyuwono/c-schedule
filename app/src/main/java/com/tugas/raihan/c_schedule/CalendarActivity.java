package com.tugas.raihan.c_schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
