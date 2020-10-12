package com.example.android.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  int counter= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout. activity_main );
        String instanceState;
        if (savedInstanceState == null ){
            instanceState = "Первый запуск!" ;
        }
        else {
            instanceState = "Повторный  запуск!!" ;
        }
        Toast. makeText (getApplicationContext(), instanceState + " - onCreate()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", instanceState+" - onCreate()" );

        final TextView textCounter = (TextView) findViewById(R.id.textView2 );
        textCounter.setText(((Integer) counter ).toString());
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textCounter.setText(((Integer) counter ).toString());

            }
        });
    }
    @Override
    protected void onStart() {
        super .onStart();
        Toast. makeText (getApplicationContext(), "onStart()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onStart()" );
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super .onRestoreInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "Повторный запуск!! - onRestoreInstanceState()" );
    }
    @Override
    protected void onResume() {
        super .onResume();
        Toast. makeText (getApplicationContext(), "onResume()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onResume()" );

    }
    @Override
    protected void onPause() {
        super .onPause();
        Toast. makeText (getApplicationContext(), "onPause()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onPause()" );
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super .onSaveInstanceState(saveInstanceState);
        Toast. makeText (getApplicationContext(), "onSaveInstanceState()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onSaveInstanceState()" );
    }
    @Override
    protected void onStop() {
        super .onStop();
        Toast. makeText (getApplicationContext(), "onStop()" , Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onStop()" );
    }
    @Override
    protected void onRestart() {
        super .onRestart();
        Toast. makeText (getApplicationContext(), "onRestart()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onRestart()" );
    }
    @Override
    protected void onDestroy() {
        super .onDestroy();
        Toast. makeText (getApplicationContext(), "onDestroy()" ,
                Toast. LENGTH_SHORT ).show();
        Log.d("MainActivity", "onDestroy()"  );

    }




}