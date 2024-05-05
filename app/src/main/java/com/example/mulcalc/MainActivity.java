package com.example.mulcalc;
import androidx.fragment.app.Fragment;
import com.example.mulcalc.R;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mulcalc.databinding.ActivityMainBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new additionFragment());
        binding.button.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.fitStart) {
                replaceFragment(new additionFragment());
                return true;
            } else if (item.getItemId() == R.id.second) {
                replaceFragment(new mulFragment());
                return true;
            } else if (item.getItemId() == R.id.third) {
                replaceFragment(new substractionFragment());
                return true;
            }
            return false; // Return false for unhandled cases
        });

    }

        private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment); // Provide the ID of the container layout and the fragment
        fragmentTransaction.commit();
    }
}
