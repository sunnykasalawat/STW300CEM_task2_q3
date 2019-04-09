package com.e.question3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float sal,tax,year;
    private EditText txt1;
    private Button btn;
    private TextView reslt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        txt1=findViewById(R.id.monthlysal);
        btn=findViewById(R.id.btncal);
        reslt1=findViewById(R.id.taxresult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sal=Float.parseFloat(txt1.getText().toString());
                year=sal*12;
                if(year<=200000 && year>1){
                    tax=(year*1)/100;
                    reslt1.setText(""+tax);
                }else if(year>200000 && year<=350000){
                    tax=((year-200000)*15/100)+2000;
                    reslt1.setText(""+tax);

                }else if(year>350000){
                    tax=(((year-200000-150000)*25)/100)+2000+22500;
                    reslt1.setText(""+tax);
                }
            }
        });
    }
}
