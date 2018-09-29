package ina.devera.com.deverainalab4;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class DeVeraInaLab4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_vera_ina_lab4);
        Log.d("4ITH","tumakbo si onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH","onResume() has executed...");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH","onStop() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH","onPause() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH","onRestart() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH","onDestroy() has executed...");
    }

    public void displaymSg(View v) {
        Toast.makeText(this, "Tell me why~",Toast.LENGTH_LONG).show();
    }

    public void displayMsg(View y) {
        Snackbar.make(y,"Ain't nothing but a heartbreak~",Snackbar.LENGTH_LONG).show();
    }
}
