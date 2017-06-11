package com.sampleapp.mvpbase;

import com.sampleapp.base.RetryInterface;

/**
 * <p/>
 * Base interface that any class that wants to act as a View in the MVP (Model View Presenter)
 * pattern must implement. Generally this interface will be extended by a more specific interface
 * that then usually will be implemented by an Activity or Fragment.
 */
public interface MvpView {

    void showProgress();

    void hideProgress();

    void onError(Throwable t);

    void onException(String message);

    void showServerError(RetryInterface retry, String Message);
}