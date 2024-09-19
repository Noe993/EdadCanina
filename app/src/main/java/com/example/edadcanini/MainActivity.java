package com.example.edadcanini;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText edadEdit = findViewById(R.id.edadEdit);
        TextView resultText = findViewById(R.id.result_text);
        Button buton = findViewById(R.id.btnCalc);

        buton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String edad = edadEdit.getText().toString();
                if(!edad.isEmpty()){
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadoString = "La edad del perruno es" + resultado;
                    resultText.setText(resultadoString);
                }else{
                    Toast.makeText(MainActivity.this, "Pongale texto chamaco",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}