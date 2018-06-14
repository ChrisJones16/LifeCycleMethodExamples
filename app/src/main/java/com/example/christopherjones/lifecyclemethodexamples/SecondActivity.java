package com.example.christopherjones.lifecyclemethodexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button finishButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //links variable reference to UI element for this activity by id
        finishButton = findViewById(R.id.finish_button);

        //method to set listener
        setListener();
    }

    //starts onClickListener for button
    private void setListener() {

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This will close this Activity and take us back to the MainActivity
                finish();
            }
        });

    }
}
