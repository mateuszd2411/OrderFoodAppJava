package com.ganarstudio.orderfoodappjava.Adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.asksira.loopingviewpager.LoopingPagerAdapter;
import com.asksira.loopingviewpager.LoopingViewPager;
import com.bumptech.glide.Glide;
import com.ganarstudio.orderfoodappjava.Model.BestDealModel;
import com.ganarstudio.orderfoodappjava.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyBestDealsAdapter extends LoopingPagerAdapter<BestDealModel> {

    @BindView(R.id.img_best_deal)
    ImageView img_best_deal;
    @BindView(R.id.txt_best_deal)
    TextView txt_best_deal;

    Unbinder unbinder;

    public MyBestDealsAdapter(Context context, List<? extends BestDealModel> itemList, boolean isInfinite) {
        super(context, itemList, isInfinite);
    }

    @Override
    protected View inflateView(int i, ViewGroup viewGroup, int i1) {
        return LayoutInflater.from(getContext()).inflate(R.layout.layout_best_deal_item,viewGroup,false);
    }

    @Override
    protected void bindView(View view, int listPosition, int i1) {
        unbinder = ButterKnife.bind(this, view);
        //set data
        Glide.with(view).load(getItemList().get(listPosition).getImage()).into(img_best_deal);
        txt_best_deal.setText(getItemList().get(listPosition).getName());
    }
}
