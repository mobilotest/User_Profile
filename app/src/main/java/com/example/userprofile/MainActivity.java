package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myPhoto = (ImageView) findViewById(R.id.photo);
        myPhoto.setImageResource(R.drawable.photka);

        TextView myName = (TextView) findViewById(R.id.name);
        myName.setText("Homer Simpson");

        TextView myBirthday = (TextView) findViewById(R.id.birthday);
        myBirthday.setText("May 12th");

        TextView myBirthplace = (TextView) findViewById(R.id.home);
        myBirthplace.setText("USA! USA! USA!");
    }
}
