package sg.edu.rp.c346.id21033869.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {
    TextView tvModName;
    TextView tvModCode;
    TextView tvAcadYr;
    TextView tvSem;
    TextView tvModCred;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvModName=findViewById(R.id.textViewName);
        tvModCode=findViewById(R.id.textViewCode);
        tvAcadYr=findViewById(R.id.textViewYr);
        tvSem=findViewById(R.id.textViewSem);
        tvModCred=findViewById(R.id.textViewCred);
        tvVenue=findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String modName = intentReceived.getStringExtra("Name");
        String modCode = intentReceived.getStringExtra("Code");
        int modYr = intentReceived.getIntExtra("Yr",2020);
        int modSem = intentReceived.getIntExtra("Sem",1);
        int modCredit = intentReceived.getIntExtra("Cred",0);
        String modVenue = intentReceived.getStringExtra("Venue");

        tvModName.setText(modName);
        tvModCode.setText(modCode);
        tvAcadYr.setText(String.valueOf(modYr));
        tvSem.setText(String.valueOf(modSem));
        tvModCred.setText(String.valueOf(modCredit));
        tvVenue.setText(modVenue);

    }
}