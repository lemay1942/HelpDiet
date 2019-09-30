package com.example.HelpDiet.ui.rice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RiceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RiceViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}