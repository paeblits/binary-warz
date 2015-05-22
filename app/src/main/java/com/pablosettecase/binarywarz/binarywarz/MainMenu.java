package com.pablosettecase.binarywarz.binarywarz;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bruno on 5/16/15.
 */
public class MainMenu extends ActionBarActivity {
    private Button start;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //keeps app in portrait mode

        start =  (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
    }
}