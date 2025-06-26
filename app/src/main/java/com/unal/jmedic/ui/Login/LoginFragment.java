package com.unal.jmedic.ui.Login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
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

public class LoginFragment extends AppCompatActivity {
    private static final String Pref_Cedula = "cedulaguardada";
    private static final String Pref_remember_cedula_checked = "remembercedula";

    EditText Textcedula;
    EditText Textpassword;
    Button buttonlogin;
    CheckBox checkBox;

    FirebaseDatabase database;
    SharedPreferences sharedPreferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
        sharedPreferences = getSharedPreferences(Pref_Cedula, Context.MODE_PRIVATE);

        Textcedula = findViewById(R.id.InputCedula);
        Textpassword = findViewById(R.id.InputPassword);
        buttonlogin = findViewById(R.id.login);
        checkBox = findViewById(R.id.checkerBox);
        database = FirebaseDatabase.getInstance();

        loadPreferences();

        buttonlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String cedula = Textcedula.getText().toString().trim();
                String password = Textpassword.getText().toString().trim();

                if (cedula.isEmpty()) {
                    Textcedula.setError("Por favor ingrese su cedula");
                    Textcedula.requestFocus();
                    return;
                }
                if (password.isEmpty()) {
                    Textpassword.setError("Por favor ingrese su contraseña");
                    Textpassword.requestFocus();
                    return;
                }

                if (checkBox.isChecked()) {
                    savePreferences(cedula, true);
                } else {
                    clearPreferences();
                }
                savePasswordtoFirebase(cedula, password);

                NavHostFragment.findNavController(LoginFragment.this)
                        .navigate(R.id.action_loginFragment_to_homeFragment);
            }
        });

    }

    private void loadPreferences() {
        boolean rememberCedulaChecked = sharedPreferences.getBoolean(Pref_remember_cedula_checked, true);
        checkBox.setChecked(rememberCedulaChecked);

        if (rememberCedulaChecked) {
            String saveCedula = sharedPreferences.getString(Pref_Cedula, "");
            Textcedula.setText(saveCedula);
        }
    }

    private void savePreferences(String cedula, boolean rememberCedulaChecked) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Pref_Cedula, cedula);
        editor.putBoolean(Pref_remember_cedula_checked, rememberCedulaChecked);
        editor.apply();
    }

    private void clearPreferences() {
        boolean rememberCedulaChecked = sharedPreferences.getBoolean(Pref_remember_cedula_checked, false);

    }

    private void savePasswordtoFirebase(String cedula, String passwordValue) {

        String safeCedulaKey = cedula.replaceAll(".", "").replace("#", "")
                .replace("$", "").replace("[", "").replace("]", "").replace(" ", "");
        DatabaseReference usersRef = database.getReference("users");
        ;
        DatabaseReference userRef = usersRef.child(safeCedulaKey);



    }

}
