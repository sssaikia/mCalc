package com.sstudio.mcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    double var=0;
    double negFactor= 0.33;
    double posFactor= 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.right)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posFactor= Double.parseDouble(((EditText)findViewById(R.id.pos)).getText().toString());
                var=var+posFactor;
                UpdateText();
            }
        });
        ((Button)findViewById(R.id.wrong)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negFactor = Double.parseDouble(((EditText)findViewById(R.id.neg)).getText().toString());
                var=var-negFactor;
                UpdateText();
            }
        });
        ((Button)findViewById(R.id.reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var=0;
                UpdateText();
            }
        });

    }
    void UpdateText(){
        ((TextView)findViewById(R.id.textview)).setText(String.valueOf(var));
    }
}
