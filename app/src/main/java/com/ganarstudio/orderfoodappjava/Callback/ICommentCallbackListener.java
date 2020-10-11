package com.ganarstudio.orderfoodappjava.Callback;

import com.ganarstudio.orderfoodappjava.Model.CommentModel;

import java.util.List;

public interface ICommentCallbackListener {
    void onCommentLoadSuccess(List<CommentModel> commentModels);
    void onCommentLoadFiled(String message);
}
