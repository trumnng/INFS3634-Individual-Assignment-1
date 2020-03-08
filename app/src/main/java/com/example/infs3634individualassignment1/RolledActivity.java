package com.example.infs3634individualassignment1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RolledActivity extends AppCompatActivity {
    private TextView number1;
    private TextView number2;
    private TextView numberSum;
    private ImageView imageDice1;
    private ImageView imageDice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolled);

        Bundle extras = getIntent().getExtras();
        int[] numberArray = extras.getIntArray("IntArray");

        int numberF = numberArray[0];
        int numberS = numberArray[1];
        int numberSummed = numberArray[2];

        switch (numberF) {
            case 1:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side1);
                break;
            case 2:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side2);
                break;
            case 3:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side3);
                break;
            case 4:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side4);
                break;
            case 5:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side5);
                break;
            case 6:
                imageDice1 = (ImageView) findViewById(R.id.imvDice1);
                imageDice1.setImageResource(R.drawable.side6);
                break;
        }

        switch (numberS) {
            case 1:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side1);
                break;
            case 2:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side2);
                break;
            case 3:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side3);
                break;
            case 4:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side4);
                break;
            case 5:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side5);
                break;
            case 6:
                imageDice2 = (ImageView) findViewById(R.id.imvDice2);
                imageDice2.setImageResource(R.drawable.side6);
                break;
        }
        
        String number1S = Integer.toString(numberF);
        String number2S = Integer.toString(numberS);
        String numberSS = Integer.toString(numberSummed);

//        number1 = findViewById(R.id.txvNumber1);
//        number1.setText(number1S);
//        number2 = findViewById(R.id.txvNumber2);
//        number2.setText(number2S);
        numberSum = findViewById(R.id.txvNumberSum);
        numberSum.setText(numberSS);
    }
}
