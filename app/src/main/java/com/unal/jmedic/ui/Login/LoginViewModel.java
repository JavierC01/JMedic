package com.unal.jmedic.ui.Login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private static String model;
        public LoginViewModel() {
            model = "LoginViewModel";

        }
        public static String getModel() {
            return model;
        }

}
