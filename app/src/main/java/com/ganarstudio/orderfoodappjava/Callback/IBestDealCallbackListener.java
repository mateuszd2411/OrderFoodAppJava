package com.ganarstudio.orderfoodappjava.Callback;

import com.ganarstudio.orderfoodappjava.Model.BestDealModel;

import java.util.List;

public interface IBestDealCallbackListener {
    void onBestDealLoadSuccess(List<BestDealModel> bestDealModels);
    void onBestDealLoadFailed(String message);
}
