package com.example.gayathri.revelio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setLogo(R.mipmap.revelio_icon);
        setSupportActionBar(myToolbar);
    }

    public void maps(View view)
    {
         Intent i=new Intent(this,MapsActivity.class);
        startActivity(i);
    }
}
