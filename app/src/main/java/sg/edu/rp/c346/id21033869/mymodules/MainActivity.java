package sg.edu.rp.c346.id21033869.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;
    TextView tvMod3;
    TextView tvMod4;
    TextView tvMod5;
    TextView tvMod6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.textViewMod1);
        tvMod2 = findViewById(R.id.textViewMod2);
        tvMod3 = findViewById(R.id.textViewMod3);
        tvMod4 = findViewById(R.id.textViewMod4);
        tvMod5 = findViewById(R.id.textViewMod5);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, ModuleActivity.class);
                intent1.putExtra("Name", "Android Programming");
                intent1.putExtra("Code", "C346");
                intent1.putExtra("Yr", 2022);
                intent1.putExtra("Sem", 1);
                intent1.putExtra("Cred", 4);
                intent1.putExtra("Venue", "E62E");

                startActivity(intent1);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ModuleActivity.class);
                intent2.putExtra("Name", "Web application Development in php");
                intent2.putExtra("Code", "C203");
                intent2.putExtra("Yr", 2022);
                intent2.putExtra("Sem", 1);
                intent2.putExtra("Cred", 4);
                intent2.putExtra("Venue", "W65H");

                startActivity(intent2);
            }
        });
        tvMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, ModuleActivity.class);
                intent3.putExtra("Name", "UI/UX Design for apps");
                intent3.putExtra("Code", "C218");
                intent3.putExtra("Yr", 2022);
                intent3.putExtra("Sem", 1);
                intent3.putExtra("Cred", 4);
                intent3.putExtra("Venue", "E66B");

                startActivity(intent3);
            }
        });
        tvMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, ModuleActivity.class);
                intent4.putExtra("Name", "IT Security and management");
                intent4.putExtra("Code", "C235");
                intent4.putExtra("Yr", 2022);
                intent4.putExtra("Sem", 1);
                intent4.putExtra("Cred", 4);
                intent4.putExtra("Venue", "W65G");

                startActivity(intent4);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, ModuleActivity.class);
                intent5.putExtra("Name", "Software Development Process");
                intent5.putExtra("Code", "C206");
                intent5.putExtra("Yr", 2022);
                intent5.putExtra("Sem", 1);
                intent5.putExtra("Cred", 4);
                intent5.putExtra("Venue", "E66K");

                startActivity(intent5);
            }
        });
    }
}