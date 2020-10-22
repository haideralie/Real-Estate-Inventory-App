package com.example.semesterproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;

public class Inventory extends AppCompatActivity {

    private TextView showtext;
    private Button display;
    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;
    private RecyclerView recyclerview_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        recyclerview_data = findViewById(R.id.recyclerview_data);
        recyclerview_data.setLayoutManager(new LinearLayoutManager(this));
        String[] mydata = {"haider//ali//miansab","mubashir//shah//don","zain//ahmad//arain"};
        recyclerview_data.setAdapter(new myadapter(mydata));

        myRef = FirebaseDatabase.getInstance().getReference();

        //showtext.setOnClickListener(new View.OnClickListener());
    }
}
