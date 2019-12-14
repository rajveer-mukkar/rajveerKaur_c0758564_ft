package com.example.rajveer_c0758564_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {
    ImageView image;
    TextView name;
    TextView email;
    TextView phone;
    int[] faces = {R.drawable.icon01_01,R.drawable.icon01_02,R.drawable.icon01_03,R.drawable.icon01_04,R.drawable.icon01_05};
ArrayList<Information> my_record = Information.information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        image = findViewById(R.id.icon_image);
        name = findViewById(R.id.name_tv);
        email = findViewById(R.id.email_tv);
        phone = findViewById(R.id.phone_tv);

        Intent this_intent = getIntent();
        int position = Integer.parseInt(this_intent.getExtras().getString("position"));
        Information info = my_record.get(position);
        image.setImageResource(faces[position]);
        name.setText(info.getMyName());
        email.setText(info.getMyEmail());
        phone.setText(info.getMyPhone());
    }
}
