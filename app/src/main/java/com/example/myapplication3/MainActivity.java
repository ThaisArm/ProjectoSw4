package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.showCount);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.MesajeToast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mcount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mcount));
        }
    }
}