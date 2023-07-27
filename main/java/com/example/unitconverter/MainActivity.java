package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private TextView finalans;
    private Spinner unit1, unit2;
    private EditText text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unit1 = findViewById(R.id.spinner);
        unit2 = findViewById(R.id.spinner1);
        text1 = findViewById(R.id.editTextText);
        finalans = findViewById(R.id.textView2);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fromunit = unit1.getSelectedItem().toString();
                String tounit = unit2.getSelectedItem().toString();

                int num = Integer.parseInt(text1.getText().toString());

                if (fromunit.equals("Centimeter") && tounit.equals("Meter")) {
                    float ans = (float) (num * 0.01);
                    finalans.setText(String.valueOf(ans));
                } else if (fromunit.equals("Meter") && tounit.equals("Centimeter")) {
                    int ans = num * 100;
                    finalans.setText(String.valueOf(ans));
                } else if (fromunit.equals("Grams") && tounit.equals("Kilograms")) {
                    float ans = (float) (num * 0.001);
                    finalans.setText(String.valueOf(ans));
                } else if (fromunit.equals("Kilograms") && tounit.equals("Grams")) {
                    int ans = num * 1000;
                    finalans.setText(String.valueOf(ans));
                }
            }
        });
    }
}
