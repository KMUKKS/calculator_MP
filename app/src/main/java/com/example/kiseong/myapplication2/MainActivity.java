package com.example.kiseong.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int check = 0;
    int max = 300;
    int min = 0;
    int number = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onclick_send(View view){
        TextView textView = (TextView) findViewById(R.id.editText);
        number = random.nextInt(300);

        String asd = "당신의 숫자는" + String.valueOf(number);

        textView.setText(asd);
    }

    public void onclick_bigger(View view) {
        min = number;
        check++;
        TextView textView = (TextView) findViewById(R.id.editText);

        number = (min + max) / 2;

        String asd = "당신의 숫자는" + String.valueOf(number);
        textView.setText(asd);
    }

    public void onclick_smaller(View view) {
        max = number;
        check++;
        TextView textView = (TextView) findViewById(R.id.editText);

        number = (min + max) / 2;

        String asd = "당신의 숫자는" + String.valueOf(number);
        textView.setText(asd);

    }

    public void onclick_bingo(View view) {
        TextView textView = (TextView) findViewById(R.id.editText);

        String asd = "정답입니다." + String.valueOf(number);
        textView.setText(asd);
    }


}
