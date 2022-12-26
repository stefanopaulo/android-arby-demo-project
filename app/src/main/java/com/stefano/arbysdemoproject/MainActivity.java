package com.stefano.arbysdemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase();
        decrease();
    }

    public void increase() {
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(view -> {
            quantity++;

            TextView quantityText = findViewById(R.id.quantityText);
            quantityText.setText(String.valueOf(quantity));
        });
    }

    public void decrease() {
        Button btnSub = findViewById(R.id.btnSub);

        btnSub.setOnClickListener(view -> {
            if (quantity > 0) {
                quantity--;
            }

            TextView quantityText = findViewById(R.id.quantityText);
            quantityText.setText(String.valueOf(quantity));
        });
    }
}