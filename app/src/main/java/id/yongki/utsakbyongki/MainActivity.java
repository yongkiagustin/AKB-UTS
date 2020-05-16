package id.yongki.utsakbyongki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id.yongki.utsakbyongki.nama";
    public static final String EXTRA_MESSAGE2 = "id.yongki.utsakbyongki.umur";
    public static final String EXTRA_MESSAGE3 = "id.yongki.utsakbyongki.gender";

    private EditText etNamaAnak;
    private EditText etUmur;
    private RadioGroup rbgander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declareView();

    }
    private void declareView(){
        etNamaAnak = findViewById(R.id.main_etNamaAnak);
        etUmur = findViewById(R.id.main_etUmur);
        rbgander = findViewById(R.id.radiogander);

    }
    private String getGender() {
        int selectedRadioId = rbgander.getCheckedRadioButtonId();
        if (selectedRadioId < 0) return "";

        RadioButton gender = findViewById(selectedRadioId);
        return gender.getText().toString();
    }
    public void daftarBtn(View view){
        String ambilGender = getGender();
        String ambilNama = etNamaAnak.getText().toString();
        String ambilUmur = etUmur.getText().toString();
        if(TextUtils.isEmpty(ambilNama)|| TextUtils.isEmpty(ambilUmur)|| TextUtils.isEmpty(ambilGender)){
            Toast.makeText(this, "Data belum terisi semua!", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra(EXTRA_MESSAGE,ambilNama);
            intent.putExtra(EXTRA_MESSAGE2,ambilUmur);
            intent.putExtra(EXTRA_MESSAGE3,ambilGender);
            startActivity(intent);
        }


    }
}
