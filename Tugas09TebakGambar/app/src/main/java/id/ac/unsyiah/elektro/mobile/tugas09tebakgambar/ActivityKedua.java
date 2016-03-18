package id.ac.unsyiah.elektro.mobile.tugas09tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by User on 3/18/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        ImageView tampil = (ImageView) findViewById(R.id.hasil);
        TextView pilihan = (TextView) findViewById(R.id.textView);
        TextView tulis = (TextView) findViewById(R.id.textView2);
        String [] nama={"Mobil","Sepeda Motor","Becak Mesin","Becak Dayung","Sepeda"};
        int [] gambar= {R.drawable.mobil2,R.drawable.sepedamotor,R.drawable.becakmesin,R.drawable.becakdayung,R.drawable.sepeda};

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(gambar.length);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("tebak", 0);


        pilihan.setText("Anda Memilih " + nama[posisi]);




        if(posisi == randomInt){
            tulis.setText("Tebakan Anda Benar");
        }else{
            tulis.setText("Tebakan Salah, Seharusnya "+nama[randomInt]);
        }


        tampil.setImageResource(gambar[randomInt]);

    }
}