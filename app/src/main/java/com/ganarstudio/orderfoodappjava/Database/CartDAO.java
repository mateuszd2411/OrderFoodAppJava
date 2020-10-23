package com.ganarstudio.orderfoodappjava.Database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

public interface CartDAO {
    @Query("SELECT * FROM Cart WHERE uid=uid")
    Flowable<List<CartItem>> getAllCart(String uid);

    @Query("SELECT COUNT(*) FROM Cart WHERE uid=uid")
    Single<Integer> countItemInCart(String uid);

    @Query("SELECT SUM(foodPrice*foodQuantity) + (foodPrice*foodQuantity) WHERE uid =: uid")
    Single<Long> sumPriceInCart(String uid);

    @Query("SELECT * FROM Cart WHERE foodId = foodId AND uid = uid")
    Single<CartItem> getItemCart(String foodId, String uid);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertOrReplaceAll(CartItem... cartItems);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    Single<Integer> updateCartItems(CartItem cartItem);

    @Delete
    Single<Integer> deleteCategoryItem(CartItem cartItem);

    @Query("DELETE FROM Cart WHERE uid=:uid")
    Single<Integer> cleanCart(String uid);

}
