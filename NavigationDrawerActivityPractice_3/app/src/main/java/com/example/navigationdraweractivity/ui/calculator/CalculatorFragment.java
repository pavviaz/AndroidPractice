package com.example.navigationdraweractivity.ui.calculator;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import com.example.navigationdraweractivity.R;

import java.util.List;


public class CalculatorFragment extends Fragment implements View.OnClickListener {

    TextView txtExpression;
    TextView txtResult;
    Button evalButton;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calculator, container, false);

        txtResult = (TextView) root.findViewById(R.id.txtResult);
        txtExpression = (TextView) root.findViewById(R.id.expression);
        evalButton = (Button) root.findViewById(R.id.evalButton);
        evalButton.setOnClickListener(this);
        txtResult.setPaintFlags(txtResult.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);

        return root;
    }

    public void onClick(View v) {
        String expr = String.valueOf(txtExpression.getText());

        List<String> expression = RPN_Parser.getParsedStr(expr);
        if (expression.size() != 0 && !expression.contains("Error")) {
            txtResult.setText(String.valueOf(PRN_Core.calc(expression)));
        }
        else {
            txtResult.setText("Error");
        }
    }


}