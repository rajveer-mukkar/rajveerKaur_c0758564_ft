package com.example.rajveer_c0758564_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int images[] = { R.drawable.icon01_01,R.drawable.icon01_02,R.drawable.icon01_03,R.drawable.icon01_04,R.drawable.icon01_05};
    ArrayList<Information> counts = Information.information;




    Button addUserBtn;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addUserBtn = findViewById(R.id.Add_user_btn);
        listview = findViewById(R.id.listVIEW);



        addUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RecevActivity.class);
                startActivity(i);
            }
        });
        final ImagesAdapter imagesAdapter = new ImagesAdapter(this,images,counts);
        listview.setAdapter(imagesAdapter);




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,RecordActivity.class);
                String my_string = String.valueOf(position);
                intent.putExtra("position",my_string);
                startActivity(intent);
            }
        });





    }
}
