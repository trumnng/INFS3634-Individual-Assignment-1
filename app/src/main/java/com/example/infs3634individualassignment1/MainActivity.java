package com.example.infs3634individualassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button roller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roller = findViewById(R.id.btnRoll);
        roller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchRolledActivity();
            }
        });
    }

    private void launchRolledActivity() {
        int number1 = ((int) Math.floor(Math.random() * 6) + 1);
        int number2 = ((int) Math.floor(Math.random() * 6) + 1);

        int numberSum = number1 + number2;

        int[] numberArray = new int[3];
        numberArray[0] = number1;
        numberArray[1] = number2;
        numberArray[2] = numberSum;

//        String[] numbersSArray = new String[numberArray.length];
//
//        for (int i = 0; i < numberArray.length; i++) {
//            numbersSArray[i] = String.valueOf(numberArray[i]);
//        }

        Intent intent = new Intent(this, RolledActivity.class);
        intent.putExtra("IntArray", numberArray);
        startActivity(intent);
    }
}
