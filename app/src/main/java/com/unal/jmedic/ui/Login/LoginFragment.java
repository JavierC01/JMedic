package com.unal.jmedic.ui.Login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;


import com.unal.jmedic.databinding.ActivityMainBinding;
import com.unal.jmedic.databinding.FragmentLoginBinding;
import com.unal.jmedic.ui.Login.LoginFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.unal.jmedic.R;

public class LoginFragment extends Fragment implements View.OnClickListener {

    private FragmentLoginBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        com.unal.jmedic.ui.Login.LoginViewModel loginViewModel = new ViewModelProvider(this).get(com.unal.jmedic.ui.Login.LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        EditText Textcedula = binding.InputCedula;
        EditText Textpassword = binding.InputPassword;
        Button button = binding.loginbttn;

        CheckBox checkBox = binding.checkerBox;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        button.setOnClickListener(this);
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
