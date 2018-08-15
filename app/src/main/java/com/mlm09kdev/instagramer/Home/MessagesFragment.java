package com.mlm09kdev.instagramer.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mlm09kdev.instagramer.R;

/**
 * Created by Manuel Montes de Oca on 8/14/2018.
 */
public class MessagesFragment extends Fragment {
    private static final String TAG = "MessagesFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messages_layout, container, false);
        return  view;
    }
}
