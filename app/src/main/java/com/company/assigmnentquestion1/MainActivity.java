package com.company.assigmnentquestion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText height,weight,result;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialze();
    }

    private void initialze(){

        height = findViewById(R.id.et_height);
        weight = findViewById(R.id.et_weight);
        calculate = findViewById(R.id.btn_calculate);
        result = findViewById(R.id.et_result);
        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
Double heightValue = Double.parseDouble(height.getText().toString());
Double weightValue = Double.parseDouble(weight.getText().toString());
Double heightInMeters = heightValue/100;

Double BMI = weightValue/(heightInMeters*heightInMeters);

result.setText(BMI.toString());

if(BMI<18.5){
    Toast.makeText(MainActivity.this,"Underweight",Toast.LENGTH_LONG).show();
}
else if(BMI>18.5 && BMI<24.9){

    Toast.makeText(MainActivity.this,"Normal Weight",Toast.LENGTH_LONG).show();

}
else if(BMI>25 && BMI<29.9){
    Toast.makeText(MainActivity.this,"Overweight",Toast.LENGTH_LONG).show();

}
else {
    Toast.makeText(MainActivity.this,"Obesity",Toast.LENGTH_LONG).show();

}
    }
}
