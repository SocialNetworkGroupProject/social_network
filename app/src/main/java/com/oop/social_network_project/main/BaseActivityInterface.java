package com.oop.social_network_project.main;

import android.content.DialogInterface;

public interface BaseActivityInterface {

    void showProgress(String message);

    void hideProgress();

    void showSnackBar(String message);

    void showToast(String message);

    void showWarningDialog(String message);

    void showNotCancelableWarningDialog(String message);

    void showWarningDialog(String message, DialogInterface.OnClickListener listener);

    public boolean hasInternetConnection();

    public boolean checkInternetConnection();

    void hideKeyboard();
}
