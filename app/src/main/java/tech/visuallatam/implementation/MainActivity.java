package tech.visuallatam.implementation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_action = findViewById(R.id.btn_action);

        Helper h = new Helper(btn_action) {
            @Override
            public void startIntent(String txt) {
                Intent i  = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Ejemplo", txt);
                startActivity(i);
            }
        };
    }
}
