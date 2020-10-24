package com.ganarstudio.orderfoodappjava.Database;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

public class LocalCartDataSource implements CartDataSource {
    @Override
    public Flowable<List<CartItem>> getAllCart(String uid) {
        return null;
    }

    @Override
    public Single<Integer> countItemInCart(String uid) {
        return null;
    }

    @Override
    public Single<Long> sumPriceInCart(String uid) {
        return null;
    }

    @Override
    public Single<CartItem> getItemCart(String foodId, String uid) {
        return null;
    }

    @Override
    public Completable insertOrReplaceAll(CartItem... cartItems) {
        return null;
    }

    @Override
    public Single<Integer> updateCartItems(CartItem cartItem) {
        return null;
    }

    @Override
    public Single<Integer> deleteCategoryItem(CartItem cartItem) {
        return null;
    }

    @Override
    public Single<Integer> cleanCart(String uid) {
        return null;
    }
}
