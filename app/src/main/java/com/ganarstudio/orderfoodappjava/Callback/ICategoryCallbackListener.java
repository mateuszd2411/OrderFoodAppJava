package com.ganarstudio.orderfoodappjava.Callback;

import com.ganarstudio.orderfoodappjava.Model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {
    void onCategoryLoadSuccess(List<CategoryModel> categoryModelList);
    void onCategoryLoadFailed(String message);
}
