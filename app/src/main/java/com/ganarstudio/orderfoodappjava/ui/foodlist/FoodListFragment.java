package com.ganarstudio.orderfoodappjava.ui.foodlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ganarstudio.orderfoodappjava.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FoodListFragment extends Fragment {


    private FoodListViewModel sendViewModel;

    Unbinder unbinder;
    @BindView(R.id.recycler_food_list)
    RecyclerView recycler_food_list;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(FoodListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_food_list, container, false);
        unbinder = ButterKnife.bind(this, root);
        initViews();

        sendViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        return root;
    }

    private void initViews() {
        recycler_food_list.setHasFixedSize(true);
        recycler_food_list.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}