package com.example.navigationgraphdemo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.navigationgraphdemo.R.id.settingFragment;
import static com.example.navigationgraphdemo.R.id.toaccountsFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private Button accountbtn,settingbtn;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        accountbtn=v.findViewById(R.id.accountsbtn);
        settingbtn=v.findViewById(R.id.settingsbtn);
        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        accountbtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toaccountsFragment));
        settingbtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tosettingFragment));

    }
}
