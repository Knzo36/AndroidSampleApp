package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSend_onClick(View view) {
        EditText txtName = findViewById(R.id.txtNamet);
        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setText(String.format("ウホオオオオオオオ、%s!", txtName.getText()));
    }
}
