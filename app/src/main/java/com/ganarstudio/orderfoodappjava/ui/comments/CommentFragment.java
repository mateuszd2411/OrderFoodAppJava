package com.ganarstudio.orderfoodappjava.ui.comments;

import com.ganarstudio.orderfoodappjava.Callback.ICommentCallbackListener;
import com.ganarstudio.orderfoodappjava.Model.CommentModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class CommentFragment extends BottomSheetDialogFragment implements ICommentCallbackListener {
    @Override
    public void onCommentLoadSuccess(List<CommentModel> commentModels) {

    }

    @Override
    public void onCommentLoadFiled(String message) {

    }
}
