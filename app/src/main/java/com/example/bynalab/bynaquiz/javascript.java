package com.example.bynalab.bynaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Bynalab on 7/1/18.
 */

public class javascript extends Activity {

    Button submit;
    RadioButton jscq1o1, jscq2o1, jscq3o1, jscq4o1;
    RadioGroup jsco1, jsco2, jsco3, jsco4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javascript);

        submit = findViewById(R.id.submit);

        jsco1 = findViewById(R.id.jsco1);
        jsco2 = findViewById(R.id.jsco2);
        jsco3 = findViewById(R.id.jsco3);
        jsco4 = findViewById(R.id.jsco4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jsco1.getCheckedRadioButtonId() > 0 && jsco2.getCheckedRadioButtonId() > 0 && jsco3.getCheckedRadioButtonId() > 0 && jsco4.getCheckedRadioButtonId() > 0) {

                    int opid1 = jsco1.getCheckedRadioButtonId();
                    int opid2 = jsco2.getCheckedRadioButtonId();
                    int opid3 = jsco3.getCheckedRadioButtonId();
                    int opid4 = jsco4.getCheckedRadioButtonId();

                    jscq1o1 = findViewById(opid1);
                    jscq2o1 = findViewById(opid2);
                    jscq3o1 = findViewById(opid3);
                    jscq4o1 = findViewById(opid4);


                    Intent result = new Intent(javascript.this, jscreport.class);
                    result.putExtra("jsca1", jscq1o1.getText().toString());
                    result.putExtra("jsca2", jscq2o1.getText().toString());
                    result.putExtra("jsca3", jscq3o1.getText().toString());
                    result.putExtra("jsca4", jscq4o1.getText().toString());

                    startActivity(result);


                }
                else {
                    Toast.makeText(javascript.this, "All answer must be selected", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
