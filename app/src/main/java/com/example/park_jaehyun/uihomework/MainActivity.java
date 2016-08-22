package com.example.park_jaehyun.uihomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        Button btn = (Button)findViewById(R.id.btn_navi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                //getSupportActionBar().setHomeAsUpIndicator(android.R.drawable.ic_dialog_info);
                if (savedInstanceState == null) {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.container, MessageFragment.newInstance("Main"))
                            .commit();
                }

            }
        });

        Button btn1 = (Button)findViewById(R.id.btn_risk);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RickCallActivity.class));
            }
        });

        Button btn2 = (Button)findViewById(R.id.btn_add);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SetProtectorActivity.class));
            }
        });
    }
}
