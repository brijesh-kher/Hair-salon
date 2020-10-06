package com.example.hairsalon;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StylishReview extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView discription;
    TextView namehead;
    Button button;
    public static String recievedName;
    public static int recievedImage;
    public static String recievedEmail;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stylish_review);


        image = (ImageView)findViewById(R.id.image1);
        name  = (TextView)findViewById(R.id.name1);
        discription = (TextView)findViewById(R.id.discription);
        namehead = (TextView)findViewById(R.id.start);
        button = (Button)findViewById(R.id.button1);

        toolbar =  findViewById(R.id.header);
        //setSupportActionBar(toolbar);


        toolbar.inflateMenu(R.menu.mymenu);
        toolbar.setOnMenuItemClickListener(new androidx.appcompat.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.settings) {
                    Intent intent = new Intent(StylishReview.this , Setting.class);
                    startActivity(intent);
                }
                return false;
            }
        });

        Intent intent = getIntent();

        recievedName = intent.getStringExtra("name");
        recievedImage = intent.getIntExtra("image",0);
        recievedEmail = intent.getStringExtra("email");

        name.setText(recievedName);
        image.setImageResource(recievedImage);
        discription.setText(recievedEmail);
        namehead.setText(recievedName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , DatePicker.class);
                intent.putExtra("name",recievedName);
                intent.putExtra("email", recievedEmail);
//                intent1.putExtra("address",ADDRESS.get(i));
                intent.putExtra("image", recievedImage);

                startActivity(intent);
            }
        });
    }
}
