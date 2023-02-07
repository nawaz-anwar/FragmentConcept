package com.coetusstudio.fragmentconcept;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.coetusstudio.fragmentconcept.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager frt = getSupportFragmentManager();
                FragmentTransaction ft = frt.beginTransaction();
                ft.add(R.id.wrapper, new FragmentFirst());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        binding.fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager frt = getSupportFragmentManager();
                FragmentTransaction ft = frt.beginTransaction();
                ft.add(R.id.wrapper, new FragmentSecond());

            }
        });
    }
}