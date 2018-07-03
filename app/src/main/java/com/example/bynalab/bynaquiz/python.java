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

public class python extends Activity {

    Button submit;
    RadioButton pyq1o1, pyq2o1, pyq3o1, pyq4o1;
    RadioGroup pyo1, pyo2, pyo3, pyo4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python);


        submit = findViewById(R.id.submit);

        pyo1 = findViewById(R.id.pyo1);
        pyo2 = findViewById(R.id.pyo2);
        pyo3 = findViewById(R.id.pyo3);
        pyo4 = findViewById(R.id.pyo4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (pyo1.getCheckedRadioButtonId() > 0 && pyo2.getCheckedRadioButtonId() > 0 && pyo3.getCheckedRadioButtonId() > 0 && pyo4.getCheckedRadioButtonId() > 0) {

                    int opid1 = pyo1.getCheckedRadioButtonId();
                    int opid2 = pyo2.getCheckedRadioButtonId();
                    int opid3 = pyo3.getCheckedRadioButtonId();
                    int opid4 = pyo4.getCheckedRadioButtonId();

                    pyq1o1 = findViewById(opid1);
                    pyq2o1 = findViewById(opid2);
                    pyq3o1 = findViewById(opid3);
                    pyq4o1 = findViewById(opid4);


                    Intent result = new Intent(python.this, pyresult.class);
                    result.putExtra("pya1", pyq1o1.getText().toString());
                    result.putExtra("pya2", pyq2o1.getText().toString());
                    result.putExtra("pya3", pyq3o1.getText().toString());
                    result.putExtra("pya4", pyq4o1.getText().toString());

                    startActivity(result);


                }
                else {
                    Toast.makeText(python.this, "All answer must be selected", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
