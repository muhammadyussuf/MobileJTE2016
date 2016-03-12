package id.ac.unsyiah.elektro.mobile.tugas07_pilihgambar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            imageView = (ImageView) findViewById(R.id.imageView);


            spinner = (Spinner) findViewById(R.id.spnOperasi);

        }
        public void onClick(View v) {
            final String pilihan = spinner.getSelectedItem().toString().trim();

            if (pilihan.equals("Mobil")) {
                imageView.setImageResource(R.drawable.mobil);
            } else if (pilihan.trim().equals("Sepeda Motor")) {
                imageView.setImageResource(R.drawable.sepeda_motor);
            }else if (pilihan.trim().equals("Becak Dayung")) {
                imageView.setImageResource(R.drawable.becakdayung);
            }else if (pilihan.trim().equals("Becak Motor")) {
                imageView.setImageResource(R.drawable.becakmesin);
            }else if (pilihan.trim().equals("Sepeda")) {
                imageView.setImageResource(R.drawable.sepeda);
            }
        }
}
