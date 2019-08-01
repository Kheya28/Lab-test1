package com.example.lab_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Passed_Activity extends AppCompatActivity {

    TextView textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passed_);

        textView1=findViewById(R.id.text_id1);
        textView2=findViewById(R.id.text_id2);
        textView3=findViewById(R.id.text_id3);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String s1=bundle.getString("Text1"," ");
            String s2=bundle.getString("Text2"," ");
            String s3=bundle.getString("Text3"," ");
            textView1.setText(s1);
            textView2.setText(s2);
            textView3.setText(s3);
        }
    }


}
