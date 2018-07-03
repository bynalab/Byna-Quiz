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

public class javareport extends Activity {

    TextView answer1, answer2, answer3, answer4, counts;
    Button tryAgain;
    String correct = " (Correct)";
    String incorrect = " (Incorrect)";
    String CORRECTANSWER1 = "1995";
    String CORRECTANSWER2 = "Object Oriented Language";
    String CORRECTANSWER3 = "James Gosling";
    String CORRECTANSWER4 = "System.console.out";
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javareport);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        tryAgain = findViewById(R.id.tryAgain);
        counts = findViewById(R.id.count);

        String javaq1 = getIntent().getStringExtra("javaa1");
        String javaq2 = getIntent().getStringExtra("javaa2");
        String javaq3 = getIntent().getStringExtra("javaa3");
        String javaq4 = getIntent().getStringExtra("javaa4");

        if (javaq1.equals(CORRECTANSWER1)) {
            answer1.setText(javaq1 + correct);
            count += 1;
        } else {
            answer1.setText(javaq1 + incorrect);
        }
        if (javaq2.equals(CORRECTANSWER2)) {
            answer2.setText(javaq2 + correct);
            count += 1;
        } else {
            answer2.setText(javaq2 + incorrect);
        }
        if (javaq3.equals(CORRECTANSWER3)) {
            answer3.setText(javaq3 + correct);
            count += 1;
        } else {
            answer3.setText(javaq3 + incorrect);
        }
        if (javaq4.equals(CORRECTANSWER4)) {
            answer4.setText(javaq4 + correct);
            count += 1;
        } else {
            answer4.setText(javaq4 + incorrect);
        }
        counts.setText("You got " + count + " out of 4");

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tryAgain = new Intent(javareport.this, topic.class);
                startActivity(tryAgain);
            }
        });
    }
}
