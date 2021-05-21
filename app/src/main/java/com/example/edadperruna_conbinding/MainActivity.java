package com.example.edadperruna_conbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edadperruna_conbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);
        View.OnClickListener escuchar = new View.OnClickListener(){
            @Override
            public void onClick (View b){
                try {
                    int edad_entera = Integer.parseInt(binding.data.getText().toString());
                    binding.resultado.setText("Tú edad si fuera perrito sería: " + (edad_entera*6));
                }
                catch (NumberFormatException ex){
                    binding.resultado.setText("Error, inserte un número");
                }
            }
        };
        binding.calcular.setOnClickListener(escuchar);

    }
}