package com.example.handsonjavaappclockdigital;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtUpdateHoraAtual;

    private TextClock txtHoraAtual, txtHora24PM_AM;


    private Button btnUpdadeHoraAtual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponentesDeLayout();

        capturaHoraAtual();

    }

    private void capturaHoraAtual() {
        btnUpdadeHoraAtual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtUpdateHoraAtual.setText("Hora: " + txtHora24PM_AM.getText());
            }
        });
    }


    private void iniciarComponentesDeLayout() {
        txtUpdateHoraAtual = findViewById(R.id.txtUpdateHoraAtual);
        txtHoraAtual = findViewById(R.id.txtHoraAtual);
        txtHora24PM_AM = findViewById(R.id.txtHora24PM_AM);
        btnUpdadeHoraAtual = findViewById(R.id.btnUpdateHoraAtual);


    }
}