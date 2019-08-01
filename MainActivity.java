package com.example.lab_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.edit_id1);
        editText2=findViewById(R.id.edit_id2);
        editText3=findViewById(R.id.edit_id3);
        button=findViewById(R.id.btn1);

        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Passed_Activity.class);
                intent.putExtra ( "Text1", editText1.getText().toString() );
                intent.putExtra ( "Text2", editText2.getText().toString() );
                intent.putExtra ( "Text3", editText3.getText().toString() );
                startActivity(intent);
            }
        });
    }
}
