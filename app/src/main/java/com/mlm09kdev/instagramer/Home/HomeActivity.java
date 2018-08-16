package com.mlm09kdev.instagramer.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mlm09kdev.instagramer.R;
import com.mlm09kdev.instagramer.Utils.BottomNavigationViewHelper;
import com.mlm09kdev.instagramer.Utils.SectionsPagerAdapter;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private static final int ACTIVITY_NUM = 0;

    private Context mContext = HomeActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);
        Log.d(TAG, "onCreate: OnCreate");

        setupBottomNavigationView();
        setupViewPager();
    }
    //This method set up the Tabs in the Home activity, Camera, Home, and Messages
    private void setupViewPager(){
        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new CameraFragment());
        pagerAdapter.addFragment(new HomeFragment());
        pagerAdapter.addFragment(new MessagesFragment());
        ViewPager viewPager = findViewById(R.id.viewPager_Container);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_instagramer_text_logo);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
    }

    //This method sets up the Bottom Navigation view and buttons.
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up bottom navigation View");
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }
}
