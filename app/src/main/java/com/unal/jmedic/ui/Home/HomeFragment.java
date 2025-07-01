package com.unal.jmedic.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.unal.jmedic.R;
import com.unal.jmedic.databinding.FragmentHomeScreenBinding;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private FragmentHomeScreenBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        com.unal.jmedic.ui.Home.HomeViewModel homeViewModel = new ViewModelProvider(this).get(com.unal.jmedic.ui.Home.HomeViewModel.class);
        return null;
    }

    @Override
    public void onClick(View v) {

    }

}