package tech.visuallatam.implementation;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public abstract class Helper {

    Button btn;

    public Helper(final Button btn){
        this.btn = btn;

        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "TextoQuemado2";

                startIntent(text);
            }
        });
    }

    public abstract void startIntent(String txt);

}
