package com.example.bynalab.bynaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bynalab on 6/29/18.
 */

public class topic extends Activity {

    Button php, java, javascript, python;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic);

        php = findViewById(R.id.php);
        java = findViewById(R.id.java);
        javascript = findViewById(R.id.javascript);
        python = findViewById(R.id.python);

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent php = new Intent(topic.this, php.class);
                startActivity(php);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent java = new Intent(topic.this, java.class);
                startActivity(java);
            }
        });

        javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent javascript = new Intent(topic.this, javascript.class);
                startActivity(javascript);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent python = new Intent(topic.this, python.class);
                startActivity(python);
            }
        });


    }
}
