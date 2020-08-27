package com.ganarstudio.orderfoodappjava.ui.menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ganarstudio.orderfoodappjava.Callback.ICategoryCallbackListener;
import com.ganarstudio.orderfoodappjava.Model.CategoryModel;

import java.util.List;

public class MenuViewModel extends ViewModel {

    private MutableLiveData<List<CategoryModel>> categoryListMultable;
    private MutableLiveData<String> messageError;
    private ICategoryCallbackListener categoryCallbackListener;

    public MenuViewModel() {

    }

}