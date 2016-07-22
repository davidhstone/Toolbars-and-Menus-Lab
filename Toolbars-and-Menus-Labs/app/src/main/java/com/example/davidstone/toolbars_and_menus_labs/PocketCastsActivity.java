package com.example.davidstone.toolbars_and_menus_labs;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PocketCastsActivity extends AppCompatActivity implements View.OnClickListener {

    //ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocket_casts);

        Toolbar topToolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(topToolbar);
     //   getSupportActionBar().setIcon;

        Toolbar bottomToolbar = (Toolbar) findViewById(R.id.bottom_toolbar);
//        setSupportActionBar(bottomToolbar);

      //  ImageView pEImageView = (ImageView) findViewById(R.id.top_left_image);
      //  pEImageView.setOnClickListener(this);
//
        Button nextScreenButton = (Button) findViewById(R.id.next_screen_button);
        nextScreenButton.setOnClickListener(this);

    }

  // public void onClick(View view){
  //     Toast.makeText(PocketCastsActivity.this, "P.E. IN FULL EFFECT!!!",
  //             Toast.LENGTH_SHORT).show();
  // }
//
    public void onClick(View view){

        startActivity(new Intent(this, TedActivity.class));
        Toast.makeText(PocketCastsActivity.this, "P.E. IN FULL EFFECT!!!",
                Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pocket_casts_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            //case R.id.top_left_image:
            //    Toast.makeText(PocketCastsActivity.this, "It Takes a Nation " +
            //            "of Million to Hold Us Back", Toast.LENGTH_SHORT).show();
         //   case R.id.next_screen_button:
         //       startActivity(new Intent(this, TedActivity.class));
         //       return true;
            case R.id.chuck_d:
                Toast.makeText(PocketCastsActivity.this, "BASE! How low can you go? "  +
                        "Death row! What a brotha know (that's not a misspelling btw)"
                        , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.flava_flav:
                Toast.makeText(PocketCastsActivity.this, "Get up a get git git a get down! " +
                        "911's a joke in yo town", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.terminator_x:
                Toast.makeText(PocketCastsActivity.this, "WHIRRP! ZHUUUOO! AZING!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.left_image:
                Toast.makeText(PocketCastsActivity.this,
                        "...and to my rescue, it was the S1Ws!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.right_image:
                Toast.makeText(PocketCastsActivity.this,
                        "She watch channel ZERO!!", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}