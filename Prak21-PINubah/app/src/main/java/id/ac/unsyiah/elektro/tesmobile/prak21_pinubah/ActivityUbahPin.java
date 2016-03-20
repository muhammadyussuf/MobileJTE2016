package id.ac.unsyiah.elektro.tesmobile.prak21_pinubah;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityUbahPin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubahpin);
        Intent pesan = getIntent();

    }
    public void onClick3(View view){
        EditText ubah = (EditText) findViewById(R.id.ubahpin);
        String pinStr = ubah.getText().toString();
        int pinInt = Integer.valueOf(pinStr);
        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.PINSharedPref.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("pin", pinInt);
        editor.apply();
        Intent pesan2 = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(pesan2);
        finish();
    }
}