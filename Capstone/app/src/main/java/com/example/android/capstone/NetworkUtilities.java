package com.example.android.capstone;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtilities {
    private final Context context;

    public NetworkUtilities(Context context) {
        this.context = context;
    }

    public boolean isInternetConnectionPresent() {
        ConnectivityManager connectivityManager = ((ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE));
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();
        return isConnected;
    }

}
