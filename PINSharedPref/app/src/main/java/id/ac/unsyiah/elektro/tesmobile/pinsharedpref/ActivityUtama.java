package id.ac.unsyiah.elektro.tesmobile.pinsharedpref;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by User on 3/19/2016.
 */
public class ActivityUtama extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__halamanutama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);
    }
}


