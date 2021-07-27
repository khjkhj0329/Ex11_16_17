package kr.hs.emirim.w2029.ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] itemArrs = {"보스 베이비2", "알라딘", "엔드게임", "블랙 위도우", "걸캅스", "장난스러운 키스", "키싱부스", "모아나", "청년경찰", "콰이어트 플레이스2"};
    int[] posterIds = {R.drawable.post1, R.drawable.post2, R.drawable.post3, R.drawable.post4, R.drawable.post5,
            R.drawable.post6, R.drawable.post7, R.drawable.post8, R.drawable.post9, R.drawable.post10};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                imgv.setImageResource(posterIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}