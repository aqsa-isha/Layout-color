package com.example.lab5task1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button redb, greenb, blueb;
    FrameLayout Flayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Initialize all buttons
        redb = (Button) findViewById(R.id.b1);
        greenb = (Button) findViewById(R.id.b2);
        blueb = (Button) findViewById(R.id.b3);
        Flayout = (FrameLayout) findViewById(R.id.l1);

// set onclick listeners for buttons
        redb.setOnClickListener(this);
        greenb.setOnClickListener(this);
        blueb.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.b1:
                Flayout.setBackgroundColor(Color.RED);
                break;
            case R.id.b2:
                Flayout.setBackgroundColor(Color.GREEN);
                break; case R.id.b3:
                Flayout.setBackgroundColor(Color.BLUE);
                break;
        }

    }

}
