package com.example.konversisuhu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class konversi extends AppCompatActivity {
        EditText Celcius,Kelvin,Farenheit,Reamur;
        Button konvert;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_konversi);
            Celcius = (EditText)findViewById(R.id.celcius);
            Kelvin = (EditText)findViewById(R.id.kelvin);
            Farenheit = (EditText)findViewById(R.id.farenheit);
            Reamur = (EditText)findViewById(R.id.reamur);
            konvert = (Button)findViewById(R.id.btnkonvert);
        }
        public void konversisuhu (View view){
            try{
                int celcius = Integer.parseInt(Celcius.getText().toString());
                double kelvin = celcius + 273.15;
                double farenheit = celcius * 1.8 + 32;
                double reamur = celcius * 0.8;
                Kelvin.setText(String.valueOf(kelvin));
                Farenheit.setText(String.valueOf(farenheit));
                Reamur.setText(String.valueOf(reamur));

            }catch (Exception e){
                e.printStackTrace();
            }
        }
}