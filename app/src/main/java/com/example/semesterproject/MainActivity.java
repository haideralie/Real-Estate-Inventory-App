package com.example.semesterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button addplot,sold,inventory,record,logout;
    //private TextView welcometxt;

    private FirebaseAuth mAuth;
    private FirebaseAuth firebaseAuth;
    // private DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth =firebaseAuth.getInstance();

       /* if (firebaseAuth.getCurrentUser()==null) {
            finish();
            startActivity(new Intent(this, Login.class));
        } */
        FirebaseUser user = firebaseAuth.getCurrentUser();


        //myDatabase=FirebaseDatabase.getInstance();
        // myRef=myDatabase.getReference();

        // welcometxt=findViewById(R.id.welcometxt);
        addplot=findViewById(R.id.main2_addpolt);
        sold=findViewById(R.id.sold);
        inventory=findViewById(R.id.inventory);
        record=findViewById(R.id.record);
        logout=findViewById(R.id.logout);


        addplot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,    Add.class);
                startActivity(a);

            }
        });

        sold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Sold.class);
                startActivity(a);

            }
        });

        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Inventory.class);
                startActivity(a);

            }
        });


        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,BalanceSheet.class);
                startActivity(a);

            }
        });
       /* logout .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Main2Activity.this,Login.class);
                startActivity(a);

            }*/





    }
}
madsemesterproject