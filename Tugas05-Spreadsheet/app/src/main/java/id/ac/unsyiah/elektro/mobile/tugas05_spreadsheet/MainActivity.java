package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickBtnsamadengan(View view) {
        EditText numAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = numAngka1.getText().toString();
        long angka1 = Long.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = numAngka2.getText().toString();
        long angka2 = Long.valueOf(angka2Str);

        long hasil12 = angka1 + angka2;

        TextView lblHasil12 = (TextView) findViewById(R.id.lblhasil12);
        String hasil12Str = Long.toString(hasil12);
        lblHasil12.setText(hasil12Str);

        EditText numAngka3 = (EditText) findViewById(R.id.numAngka3);
        String angka3Str = numAngka3.getText().toString();
        long angka3 = Long.valueOf(angka3Str);

        EditText numAngka4 = (EditText) findViewById(R.id.numAngka4);
        String angka4Str = numAngka4.getText().toString();
        long angka4 = Long.valueOf(angka4Str);

        long hasil34 = angka3 + angka4;

        TextView lblHasil34 = (TextView) findViewById(R.id.lblhasil34);
        String hasil34Str = Long.toString(hasil34);
        lblHasil34.setText(hasil34Str);

        long hasil13 = angka1 + angka3;

        TextView lblHasil13 = (TextView) findViewById(R.id.lblhasil13);
        String hasil13Str = Long.toString(hasil13);
        lblHasil13.setText(hasil13Str);


        long hasil24 = angka2 + angka4;

        TextView lblHasil24 = (TextView) findViewById(R.id.lblhasil24);
        String hasil24Str = Long.toString(hasil24);
        lblHasil24.setText(hasil24Str);


    }
}
