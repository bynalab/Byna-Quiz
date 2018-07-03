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
 * Created by Bynalab on 6/29/18.
 */

public class php extends Activity {

    Button submit;
    RadioButton phpq1o1, phpq2o1, phpq3o1, phpq4o1;
    RadioGroup phpo1, phpo2, phpo3, phpo4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.php);

        submit = findViewById(R.id.submit);

        phpo1 = findViewById(R.id.phpo1);
        phpo2 = findViewById(R.id.phpo2);
        phpo3 = findViewById(R.id.phpo3);
        phpo4 = findViewById(R.id.phpo4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (phpo1.getCheckedRadioButtonId() > 0 && phpo2.getCheckedRadioButtonId() > 0 && phpo3.getCheckedRadioButtonId() > 0 && phpo4.getCheckedRadioButtonId() > 0) {

                    int opid1 = phpo1.getCheckedRadioButtonId();
                    int opid2 = phpo2.getCheckedRadioButtonId();
                    int opid3 = phpo3.getCheckedRadioButtonId();
                    int opid4 = phpo4.getCheckedRadioButtonId();

                    phpq1o1 = findViewById(opid1);
                    phpq2o1 = findViewById(opid2);
                    phpq3o1 = findViewById(opid3);
                    phpq4o1 = findViewById(opid4);


                    Intent result = new Intent(php.this, result.class);
                    result.putExtra("phpa1", phpq1o1.getText().toString());
                    result.putExtra("phpa2", phpq2o1.getText().toString());
                    result.putExtra("phpa3", phpq3o1.getText().toString());
                    result.putExtra("phpa4", phpq4o1.getText().toString());

                    startActivity(result);


                }
                else {
                    Toast.makeText(php.this, "All answer must be selected", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}
