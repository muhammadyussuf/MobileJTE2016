package id.ac.unsyiah.elektro.mobile.tugas08pilihgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 3/17/2016.
 */

public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("posisi", 0);

        ImageView tampil = (ImageView) findViewById(R.id.imageView);
        TextView tulis = (TextView) findViewById(R.id.textView);
        String [] nama={"","Mobil","Sepeda Motor","Becak Mesin","Becak Dayung","Sepeda"};
        int [] gambar= {0,R.drawable.mobil2,R.drawable.sepedamotor,R.drawable.becakmesin,R.drawable.becakdayung,R.drawable.sepeda};

        tampil.setImageResource(gambar[posisi]);
        tulis.setText("Anda Pilih Gambar "+nama[posisi]);
    }

}
