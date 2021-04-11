package com.mirea.vyaznikov.loadermanger;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.Random;

public class MyLoader extends AsyncTaskLoader<String> {
    private String firstName;
    public static final String ARG_WORD = "word";
    public MyLoader(@NonNull Context context, Bundle args) {
        super(context);
        if (args != null)
            firstName = args.getString(ARG_WORD);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
    @Override
    public String loadInBackground() {
        ArrayList<Character> list = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < firstName.length(); i++)
            list.add(firstName.charAt(i));
        while (list.size() != 0)
            temp += list.remove(new Random().nextInt(list.size()));

        //SystemClock.sleep(5000);
        return temp;
    }
}
