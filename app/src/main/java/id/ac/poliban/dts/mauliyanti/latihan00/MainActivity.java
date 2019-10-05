package id.ac.poliban.dts.mauliyanti.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

    //menghubungkan view dengan object button dalam source kita
        Button btFirst = findViewById(R.id.btfirst);
        Button btSecond = findViewById(R.id.btsecond);
        Button btThird = findViewById(R.id.btthird);
        Button btForth = findViewById(R.id.btforth);

        //berikut kode memasang event listener onclick pada object run
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan tombol First", Toast.LENGTH_SHORT).show();
            }
        });
        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan tombol Second", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan tombol Third", Toast.LENGTH_SHORT).show();
            }
        });
        btForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan tombol First", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
