package com.unal.jmedic.ui.Register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {
    private static String model;
    public RegisterViewModel() {
        model = "RegisterViewModel";

    }
    public static String getModel() {
        return model;
    }

}
