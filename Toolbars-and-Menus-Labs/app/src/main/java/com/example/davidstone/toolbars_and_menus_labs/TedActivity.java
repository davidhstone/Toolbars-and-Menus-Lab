package com.example.davidstone.toolbars_and_menus_labs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by davidstone on 7/21/16.
 */
public class TedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        Toolbar tedToolbar = (Toolbar) findViewById(R.id.bottom_toolbar);
        setSupportActionBar(tedToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ted_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onNavigateUp();
                return true;
            case R.id.ted_left_icon:
                Toast.makeText(TedActivity.this, "You jumped outta the jelly into a jam!"
                        , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ted_mid_icon:
                Toast.makeText(TedActivity.this, "I can't do nuttin' fo ya man"
                        , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ted_right_icon:
                Toast.makeText(TedActivity.this, "You tell 'em Chuck!"
                        , Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
