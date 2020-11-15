package com.example.konwerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Konwertuj;

        final EditText PodajIlosc;

        Konwertuj = findViewById(R.id.Konwertuj);
        PodajIlosc = findViewById(R.id.PodajIlosc);

        Konwertuj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (PodajIlosc.getText().toString().length() != 0) {
                            Toast.makeText(getApplicationContext(), "Wartość: " + String.format("%.2f $", Double.valueOf
                                    (PodajIlosc.getText().toString()) / 3.79), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Wpisz ilość złotych do przeliczenia", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}