package com.mlm09kdev.instagramer.Profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mlm09kdev.instagramer.R;

/**
 * Created by Manuel Montes de Oca on 8/15/2018.
 */
public class EditProfileFragment extends Fragment {
    private static final String TAG = "EditProfileFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_edit_profile_layout,container, false);
        return  view;
    }
}
