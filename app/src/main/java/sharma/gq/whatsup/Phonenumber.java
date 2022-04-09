package sharma.gq.whatsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import sharma.gq.whatsup.databinding.ActivityPhonenumberBinding;

public class Phonenumber extends AppCompatActivity {

    ActivityPhonenumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhonenumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.psetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phonenumber.this, Otp.class);
                intent.putExtra("phoneNumber", binding.phoneNo.getText().toString());
                startActivity(intent);
            }
        });
    }
}