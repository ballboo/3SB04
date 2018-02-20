package com.ballboo.s5835512110.ballboo999;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtTHB;
    private EditText edtUSD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTHB = (EditText) findViewById(R.id.edtTHB);
        edtUSD = (EditText) findViewById(R.id.edtUSD);
    }

    public void calculate(View view) {
        if (edtTHB.getText().toString().trim().equals("")) {
            edtTHB.setError("ใส่ตัวเลขที่ต้องการคำนวณ");
        } else {
            edtUSD.setText(String.valueOf(Double.parseDouble(edtTHB.getText().toString()) * 33.2) + " USD");
        }
    }
}