package com.mlm09kdev.instagramer.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.mlm09kdev.instagramer.Alert.AlertActivity;
import com.mlm09kdev.instagramer.Home.HomeActivity;
import com.mlm09kdev.instagramer.Profile.ProfileActivity;
import com.mlm09kdev.instagramer.R;
import com.mlm09kdev.instagramer.Search.SearchActivity;
import com.mlm09kdev.instagramer.Share.ShareActivity;

/**
 * Created by Manuel Montes de Oca on 8/13/2018.
 */
public class BottomNavigationViewHelper {
    private static final String TAG = "bottomNavigationViewHel";
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             switch (item.getItemId()){
                 case R.id.ic_home_button:
                     Intent intent = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                     context.startActivity(intent);
                     break;
                 case R.id.ic_search_button:
                     Intent intent2 = new Intent(context, SearchActivity.class);//ACTIVITY_NUM = 1
                     context.startActivity(intent2);
                     break;
                 case R.id.ic_add_button:
                     Intent intent3 = new Intent(context, ShareActivity.class);//ACTIVITY_NUM = 2
                     context.startActivity(intent3);
                     break;
                 case R.id.ic_alert_button:
                     Intent intent4 = new Intent(context, AlertActivity.class);//ACTIVITY_NUM = 3
                     context.startActivity(intent4);
                     break;
                 case R.id.ic_profile_button:
                     Intent intent5 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 4
                     context.startActivity(intent5);
                     break;
             }
                return false;
            }
        });
    }
}
