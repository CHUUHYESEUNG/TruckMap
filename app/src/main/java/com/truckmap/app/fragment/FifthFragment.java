package com.truckmap.app.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.truckmap.app.LoginActivity;
import com.truckmap.app.R;

public class FifthFragment extends Fragment {

    //Intent intent = new Intent(getActivity(), LoginActivity.class);
    //void startActivity(intent);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

}
