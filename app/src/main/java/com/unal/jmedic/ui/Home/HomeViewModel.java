package com.unal.jmedic.ui.Home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private static String model;
    public HomeViewModel() {
        model = "HomeViewModel";

    }
    public static String getModel() {
        return model;
    }

}
