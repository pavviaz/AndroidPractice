package com.example.navigationdraweractivity.ui.player;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.navigationdraweractivity.MainActivity;
import com.example.navigationdraweractivity.R;
import com.example.navigationdraweractivity.ui.calculator.PRN_Core;
import com.example.navigationdraweractivity.ui.calculator.RPN_Parser;

import java.util.List;

public class MusicPlayer extends Fragment implements View.OnClickListener {

    MainActivity myactivity;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_music_player, container, false);

        Activity activity = getActivity();
        if(activity instanceof MainActivity){
             myactivity = (MainActivity) activity;
        }

        Button playButton = (Button) root.findViewById(R.id.playButton);
        Button stopButton = (Button) root.findViewById(R.id.stopButton);

        playButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);

        return root;
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.playButton:
                myactivity.startPlayer();
                break;

            case R.id.stopButton:
                myactivity.stopPlayer();
                break;
        }
    }
}