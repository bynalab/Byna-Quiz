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

public class jscreport extends Activity {


    TextView answer1, answer2, answer3, answer4, counts;
    Button tryAgain;
    String correct = " (Correct)";
    String incorrect = " (Incorrect)";
    String CORRECTANSWER1 = "1995";
    String CORRECTANSWER2 = "Add Client-side behaviour to html";
    String CORRECTANSWER3 = "Brendan Eich";
    String CORRECTANSWER4 = "console.write";
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jscreport);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        tryAgain = findViewById(R.id.tryAgain);
        counts = findViewById(R.id.count);

        String jscq1 = getIntent().getStringExtra("jsca1");
        String jscq2 = getIntent().getStringExtra("jsca2");
        String jscq3 = getIntent().getStringExtra("jsca3");
        String jscq4 = getIntent().getStringExtra("jsca4");

        if (jscq1.equals(CORRECTANSWER1)) {
            answer1.setText(jscq1 + correct);
            count += 1;
        } else {
            answer1.setText(jscq1 + incorrect);
        }
        if (jscq2.equals(CORRECTANSWER2)) {
            answer2.setText(jscq2 + correct);
            count += 1;
        } else {
            answer2.setText(jscq2 + incorrect);
        }
        if (jscq3.equals(CORRECTANSWER3)) {
            answer3.setText(jscq3 + correct);
            count += 1;
        } else {
            answer3.setText(jscq3 + incorrect);
        }
        if (jscq4.equals(CORRECTANSWER4)) {
            answer4.setText(jscq4 + correct);
            count += 1;
        } else {
            answer4.setText(jscq4 + incorrect);
        }
        counts.setText("You got " + count + " out of 4");

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tryAgain = new Intent(jscreport.this, topic.class);
                startActivity(tryAgain);
            }
        });
    }
}
