package id.yongki.utsakbyongki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id.yongki.utsakbyongki.nama";
    public static final String EXTRA_MESSAGE2 = "id.yongki.utsakbyongki.umur";

    public static final String EXTRA_MESSAGE3 = "id.yongki.utsakbyongki.gender";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String nama = intent.getStringExtra(EXTRA_MESSAGE);
        String umur = intent.getStringExtra(EXTRA_MESSAGE2);
        String gender = intent.getStringExtra(EXTRA_MESSAGE3);
        TextView textView = findViewById(R.id.home_textview);
        textView.setText(nama+" "+gender+" "+umur+" tahun Berhasil ditambahkan. Silahkan Gunakan Kode Ini Untuk Masuk Kedalam Aplikasi Anak");
    }
}
