package com.example.rajveer_c0758564_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RecevActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button SaveBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recev);
        editText1 = findViewById(R.id.name_editText);
        editText2 = findViewById(R.id.Email_editText);
        editText3 = findViewById(R.id.Phone_editText);
        SaveBtn = findViewById(R.id.Save_btn);



        SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().isEmpty()||
                        editText2.getText().toString().isEmpty()||
                        editText3.getText().toString().isEmpty()){
                    Toast.makeText(RecevActivity.this,"You Should fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else {

//                    Toast.makeText(RecevActivity.this, "bcjhdsgfchjdgf", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RecevActivity.this,user_info.class);
                    String str = editText1.getText().toString();
                    String str2 = editText2.getText().toString();
                    String str3 = editText3.getText().toString();
                    intent.putExtra("Name",str);
                    intent.putExtra("Email",str2);
                    intent.putExtra("Phone_no",str3);
                    startActivity(intent);
                }
            }
        });
    }
}
