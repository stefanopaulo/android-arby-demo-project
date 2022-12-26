package com.stefano.arbysdemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    TextView textTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTotal = findViewById(R.id.textTotal);
        textTotal.setVisibility(View.GONE);

        increase();
        decrease();
        orderButton();
    }

    private void increase() {
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(view -> {
            if (quantity < 10) {
                quantity++;
            }

            TextView quantityText = findViewById(R.id.quantityText);
            quantityText.setText(String.valueOf(quantity));
        });
    }

    private void decrease() {
        Button btnSub = findViewById(R.id.btnSub);

        btnSub.setOnClickListener(view -> {
            if (quantity > 1) {
                quantity--;
            }

            TextView quantityText = findViewById(R.id.quantityText);
            quantityText.setText(String.valueOf(quantity));
        });
    }

    private void orderButton() {
        Button btnOrder = findViewById(R.id.btnOrder);

        btnOrder.setOnClickListener(view -> {
            int totalPrice = quantity * 15;

            String message = "Your total is $ " + totalPrice + "!";

            textTotal.setText(message);

            if (totalPrice > 0) {
                textTotal.setVisibility(View.VISIBLE);
            }
        });
    }
}