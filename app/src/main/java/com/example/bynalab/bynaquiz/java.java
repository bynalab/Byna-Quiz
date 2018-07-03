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

public class java extends Activity {

    Button submit;
    RadioButton javaq1o1, javaq2o1, javaq3o1, javaq4o1;
    RadioGroup javao1, javao2, javao3, javao4;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java);

        submit = findViewById(R.id.submit);

        javao1 = findViewById(R.id.javao1);
        javao2 = findViewById(R.id.javao2);
        javao3 = findViewById(R.id.javao3);
        javao4 = findViewById(R.id.javao4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (javao1.getCheckedRadioButtonId() > 0 && javao2.getCheckedRadioButtonId() > 0 && javao3.getCheckedRadioButtonId() > 0 && javao4.getCheckedRadioButtonId() > 0) {

                    int opid1 = javao1.getCheckedRadioButtonId();
                    int opid2 = javao2.getCheckedRadioButtonId();
                    int opid3 = javao3.getCheckedRadioButtonId();
                    int opid4 = javao4.getCheckedRadioButtonId();

                    javaq1o1 = findViewById(opid1);
                    javaq2o1 = findViewById(opid2);
                    javaq3o1 = findViewById(opid3);
                    javaq4o1 = findViewById(opid4);


                    Intent result = new Intent(java.this, javareport.class);
                    result.putExtra("javaa1", javaq1o1.getText().toString());
                    result.putExtra("javaa2", javaq2o1.getText().toString());
                    result.putExtra("javaa3", javaq3o1.getText().toString());
                    result.putExtra("javaa4", javaq4o1.getText().toString());

                    startActivity(result);


                }
                else {
                    Toast.makeText(java.this, "All answer must be selected", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
