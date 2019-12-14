package com.example.rajveer_c0758564_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;



public class user_info extends AppCompatActivity {
    ArrayList<Integer> verified = new ArrayList<Integer>();
    ArrayList<Integer> notVerified = new ArrayList<Integer>();
    public void changeSource(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img1);
        imageView.animate().alpha(0.5f);
        verified.add(1);
    }
    public void changeSource1(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img2);
verified.add(2);
        imageView.animate().alpha(0.5f);
    }
    public void changeSource2(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img3);
        verified.add(1);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource3(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img4);
        verified.add(2);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource4(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img5);
        notVerified.add(1);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource5(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img6);
        notVerified.add(1);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource6(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img7);
        notVerified.add(1);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource7(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img8);
        notVerified.add(1);

        imageView.animate().alpha(0.5f);
    }
    public void changeSource8(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img9);
        notVerified.add(1);

        imageView.animate().alpha(0.5f);
    }

        CheckBox checkbox;
        Button verify;

        @Override
        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user_info);
            checkbox = findViewById(R.id.checkBox2);
            verify = findViewById(R.id.verify_button);



            verify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(verified.size() < 4  || !notVerified.isEmpty() || !checkbox.isChecked() ) {


                        new AlertDialog.Builder(user_info.this).setTitle(" Not Verify").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
                    }
                    else if (verified.size() == 4 && notVerified.isEmpty() && checkbox.isChecked())  {
                        new AlertDialog.Builder(user_info.this).setTitle("Verify").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent1 = getIntent();
                                String name = intent1.getExtras().getString("Name");
                                String email = intent1.getExtras().getString("Email");
                                String phone_no = intent1.getExtras().getString("Phone_no");

                                Toast.makeText(user_info.this, name+email+phone_no, Toast.LENGTH_SHORT).show();
                                Information.information.add(new Information(name,email,phone_no));
                                Intent inte = new Intent(user_info.this,MainActivity.class);
                                startActivity(inte);

                            }
                        }).show();


                    }
                }
            });








        }


    }
