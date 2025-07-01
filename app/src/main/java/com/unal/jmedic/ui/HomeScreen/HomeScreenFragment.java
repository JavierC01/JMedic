package com.unal.jmedic.ui.HomeScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.unal.jmedic.R;
import com.unal.jmedic.databinding.FragmentHomeScreenBinding;

import org.jspecify.annotations.NonNull;

public class HomeScreenFragment extends Fragment implements View.OnClickListener {

    RelativeLayout drawer;
    NavController navigationView;
    private FragmentHomeScreenBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeScreenViewModel homeScreenViewModel = new ViewModelProvider(this).get(HomeScreenViewModel.class);
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.loginbttn.setOnClickListener(this);
        binding.registerbttn.setOnClickListener(this);
        drawer = binding.HomeScreelayout;
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {

    }
}
