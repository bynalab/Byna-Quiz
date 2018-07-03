package com.example.bynalab.bynaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

/**
 * Created by Bynalab on 6/30/18.
 */

public class result extends Activity {

    TextView answer1, answer2, answer3, answer4, counts;
    Button tryAgain;
    String correct = " (Correct)";
    String incorrect = " (Incorrect)";
    String CORRECTANSWER1 = "1994";
    String CORRECTANSWER2 = "Hypertext Preprocessor";
    String CORRECTANSWER3 = "Rasmus Lerdorf";
    String CORRECTANSWER4 = "echo";
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        tryAgain = findViewById(R.id.tryAgain);
        counts = findViewById(R.id.count);

        String phpq1 = getIntent().getStringExtra("phpa1");
        String phpq2 = getIntent().getStringExtra("phpa2");
        String phpq3 = getIntent().getStringExtra("phpa3");
        String phpq4 = getIntent().getStringExtra("phpa4");

        if(phpq1.equals(CORRECTANSWER1)) {
            answer1.setText(phpq1 + correct);
            count+=1;
        }
        else {
            answer1.setText(phpq1 + incorrect);
        }
        if(phpq2.equals(CORRECTANSWER2)) {
            answer2.setText(phpq2 + correct);
            count+=1;
        }
        else {
            answer2.setText(phpq2 + incorrect);
        }
        if(phpq3.equals(CORRECTANSWER3)) {
            answer3.setText(phpq3 + correct);
            count+=1;
        }
        else {
            answer3.setText(phpq3 + incorrect);
        }
        if(phpq4.equals(CORRECTANSWER4)) {
            answer4.setText(phpq4 + correct);
            count+=1;
        }
        else {
            answer4.setText(phpq4 + incorrect);
        }
        counts.setText("You got " +count+ " out of 4");

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tryAgain = new Intent(result.this, topic.class);
                startActivity(tryAgain);
            }
        });

    }
}
