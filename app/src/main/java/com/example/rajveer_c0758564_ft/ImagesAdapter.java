package com.example.rajveer_c0758564_ft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

class ImagesAdapter extends ArrayAdapter<Information> {
    Context context;
    int[] imageIcons;
   ArrayList<Information> my_record = new ArrayList<>();

//   Information count = new Information();

    public ImagesAdapter(@NonNull Context context, int[] imageIcons, ArrayList<Information> count) {
        super(context,0,count);
        this.context = context;
        this.imageIcons = imageIcons;
        this.my_record = count;
    }

//    public ImagesAdapter(@NonNull Context context, int resource, Context context1, int[] imageIcons, ArrayList<Information> count) {
//        super(context, resource);
//        this.context = context1;
//        this.imageIcons = imageIcons;
//        this.count = count;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if (convertView == null)
           convertView = LayoutInflater.from(context).inflate(R.layout.userdata,null);
       Information data = my_record.get(position);

        ImageView imageView = convertView.findViewById(R.id.myimage_view);
        TextView name = convertView.findViewById(R.id.name);
        TextView email = convertView.findViewById(R.id.Email);
        //   convertView = data.getMyName;
        //   convertView = data.getMyEmail;
        //   convertView = data.getMyPhone;

        TextView phone_no = convertView.findViewById(R.id.phone_no);
        imageView.setImageResource(imageIcons[position]);
         name.setText(data.getMyName());
         email.setText(data.getMyEmail());
         phone_no.setText(data.getMyPhone());
        return convertView;

//        return View;

    }
}
