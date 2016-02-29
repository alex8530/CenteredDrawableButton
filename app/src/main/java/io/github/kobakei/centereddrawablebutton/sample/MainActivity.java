package io.github.kobakei.centereddrawablebutton.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.github.kobakei.centereddrawablebutton.CenteredDrawableButton;
import io.github.kobakei.centereddrawablebuttonsample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CenteredDrawableButton button1 = (CenteredDrawableButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked 1", Toast.LENGTH_SHORT).show();
            }
        });

        CenteredDrawableButton button2 = (CenteredDrawableButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked 2", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onButton3Click(View v) {
        Toast.makeText(MainActivity.this, "Clicked 3", Toast.LENGTH_SHORT).show();
    }
}
