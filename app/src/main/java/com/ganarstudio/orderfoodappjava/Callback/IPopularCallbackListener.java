package com.ganarstudio.orderfoodappjava.Callback;

import com.ganarstudio.orderfoodappjava.Model.PopularCategoryModel;

import java.util.List;

public interface IPopularCallbackListener {
    void onPopularLoadSuccess(List<PopularCategoryModel> popularCategoryModels);
    void onPopularLoadFailed(String message);
}
