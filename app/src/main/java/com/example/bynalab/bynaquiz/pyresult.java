package com.example.bynalab.bynaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Bynalab on 7/1/18.
 */

public class pyresult extends Activity {

    TextView answer1, answer2, answer3, answer4, counts;
    Button tryAgain;
    String correct = " (Correct)";
    String incorrect = " (Incorrect)";
    String CORRECTANSWER1 = "1991";
    String CORRECTANSWER2 = "High Level Language";
    String CORRECTANSWER3 = "Guido van Rossum";
    String CORRECTANSWER4 = "print";
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pyresult);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        tryAgain = findViewById(R.id.tryAgain);
        counts = findViewById(R.id.count);

        String pyq1 = getIntent().getStringExtra("pya1");
        String pyq2 = getIntent().getStringExtra("pya2");
        String pyq3 = getIntent().getStringExtra("pya3");
        String pyq4 = getIntent().getStringExtra("pya4");

        if (pyq1.equals(CORRECTANSWER1)) {
            answer1.setText(pyq1 + correct);
            count += 1;
        } else {
            answer1.setText(pyq1 + incorrect);
        }
        if (pyq2.equals(CORRECTANSWER2)) {
            answer2.setText(pyq2 + correct);
            count += 1;
        } else {
            answer2.setText(pyq2 + incorrect);
        }
        if (pyq3.equals(CORRECTANSWER3)) {
            answer3.setText(pyq3 + correct);
            count += 1;
        } else {
            answer3.setText(pyq3 + incorrect);
        }
        if (pyq4.equals(CORRECTANSWER4)) {
            answer4.setText(pyq4 + correct);
            count += 1;
        } else {
            answer4.setText(pyq4 + incorrect);
        }
        counts.setText("You got " + count + " out of 4");

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tryAgain = new Intent(pyresult.this, topic.class);
                startActivity(tryAgain);
            }
        });
    }
}
