package com.example.user.project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class FoodDetails extends Activity {

    ImageView imageView;
    TextView text,Desc,Price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

//        setView
        imageView = (ImageView)findViewById(R.id.imageview);
        text = (TextView)findViewById(R.id.text);
        Desc = (TextView)findViewById(R.id.Desc);
        Price =(TextView)findViewById(R.id.price);

//        recieveData
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            String name = getIntent().getStringExtra("Head");
            int bmp = bundle.getInt("bmp");
            String desc = getIntent().getStringExtra("description");
            String price = getIntent().getStringExtra("price");

//            displayData
            text.setText(name);
            imageView.setImageResource(bmp);
            Desc.setText(desc);
            Price.setText(price);



        }
    }
}



