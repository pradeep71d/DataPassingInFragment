package com.example.fragmentdatapassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        final MyFragment myFragment=new MyFragment();
        b=findViewById(R.id.b1);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                String s1=e1.getText().toString();//getting data from mobile or user in text & storing in string
                String s2=e2.getText().toString();
                bundle.putString("key1",s1);//putting data in key and value pair
                bundle.putString("key2",s2);
                myFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.frame1,myFragment);//framelayout is container for fragment.
                fragmentTransaction.commit();//it means to apply changes
            }
        });
    }
}
