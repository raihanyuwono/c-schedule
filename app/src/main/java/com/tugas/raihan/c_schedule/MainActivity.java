package com.tugas.raihan.c_schedule;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tugas.raihan.c_schedule.adapter.ViewPagerAdapter;
import com.tugas.raihan.c_schedule.fragment.ChatFragment;
import com.tugas.raihan.c_schedule.fragment.FriendsFragment;

public class MainActivity extends AppCompatActivity {

    private final String TABBED_TITLES[] = {"Friends", "Chats"};
    private final int TABBED_ICONS[] = {R.drawable.ic_person, R.drawable.ic_chat};

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initElements();
        loadElements();
    }

    private void loadElements() {
        toolbar.setTitle(getString(R.string.app_name));
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setupTabLayout();
    }

    private void setupTabLayout() {
        for (int i = 0; i < 2; i++) {
            ViewGroup view = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.tabbed_layout, null);
            TextView title = view.findViewById(R.id.tab_title);
            ImageView icon = view.findViewById(R.id.tab_icon);
            title.setText(TABBED_TITLES[i]);
            icon.setImageResource(TABBED_ICONS[i]);
            tabLayout.getTabAt(i).setCustomView(view);
        }
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FriendsFragment());
        adapter.addFragment(new ChatFragment());
        viewPager.setAdapter(adapter);
    }

    private void initElements() {
        getSupportActionBar().hide();
        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.pager);
    }

}
