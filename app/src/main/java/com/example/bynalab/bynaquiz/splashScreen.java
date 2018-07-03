package com.example.bynalab.bynaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Bynalab on 7/1/18.
 */

public class splashScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent splash = new Intent(splashScreen.this, MainActivity.class);

                startActivity(splash);
                finish();

            }

        }, 3000); // wait for 3 seconds

    }
}
