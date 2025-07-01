package com.unal.jmedic.ui.HomeScreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeScreenViewModel extends ViewModel {
    private static String model;
    public HomeScreenViewModel() {
        model = "HomeScreenViewModel";

    }
    public static String getModel() {
        return model;
    }

}
