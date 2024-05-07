package com.example.mulcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        final int[] receivedarry = getIntent().getIntArrayExtra("Result");
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Display the result
                TextView textViewRow1Col1 = findViewById(R.id.textViewRow1Col1);
                TextView textViewRow1Col2 =findViewById(R.id.textViewRow1Col2);
                TextView textViewRow1Col3 =findViewById(R.id.textViewRow1Col3);
                TextView textViewRow2Col1 = findViewById(R.id.textViewRow2Col1);
                TextView textViewRow2Col2 =findViewById(R.id.textViewRow2Col2);
                TextView textViewRow2Col3 = findViewById(R.id.textViewRow2Col3);
                TextView textViewRow3Col1 = findViewById(R.id.textViewRow3Col1);
                TextView textViewRow3Col2 =findViewById(R.id.textViewRow3Col2);
                TextView textViewRow3Col3 = findViewById(R.id.textViewRow3Col3);

                textViewRow1Col1.setText(String.valueOf(receivedarry[0]));
                textViewRow1Col2.setText(String.valueOf(receivedarry[1]));
                textViewRow1Col3.setText(String.valueOf(receivedarry[2]));
                textViewRow2Col1.setText(String.valueOf(receivedarry[3]));
                textViewRow2Col2.setText(String.valueOf(receivedarry[4]));
                textViewRow2Col3.setText(String.valueOf(receivedarry[5]));
                textViewRow3Col1.setText(String.valueOf(receivedarry[6]));
                textViewRow3Col2.setText(String.valueOf(receivedarry[7]));
                textViewRow3Col3.setText(String.valueOf(receivedarry[8]));

            }
        });
    }
}
