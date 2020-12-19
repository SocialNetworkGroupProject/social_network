package com.oop.social_network_project.main;

import androidx.fragment.app.Fragment;

import android.content.DialogInterface;

public abstract class BaseFragment extends Fragment implements BaseActivityInterface{
    @Override
    public void showProgress(String message) {
        ((BaseActivity) getActivity()).showProgress(message);
    }

    @Override
    public void hideProgress() {
        ((BaseActivity) getActivity()).hideProgress();
    }

    @Override
    public void showSnackBar(String message) {
        ((BaseActivity) getActivity()).showSnackBar(message);
    }

    @Override
    public void showToast(String message) {
        ((BaseActivity) getActivity()).showToast(message);
    }

    @Override
    public void showWarningDialog(String message) {
        ((BaseActivity) getActivity()).showWarningDialog(message);
    }

    @Override
    public void showNotCancelableWarningDialog(String message) {
        ((BaseActivity) getActivity()).showNotCancelableWarningDialog(message);
    }

    @Override
    public void showWarningDialog(String message, DialogInterface.OnClickListener listener) {
        ((BaseActivity) getActivity()).showWarningDialog(message, listener);
    }

    @Override
    public boolean hasInternetConnection() {
        return ((BaseActivity) getActivity()).hasInternetConnection();
    }

    @Override
    public boolean checkInternetConnection() {
        return ((BaseActivity) getActivity()).hasInternetConnection();
    }

    @Override
    public void hideKeyboard() {
        ((BaseActivity) getActivity()).hideKeyboard();
    }

    public void finish() {
        ((BaseActivity) getActivity()).finish();
    }
}