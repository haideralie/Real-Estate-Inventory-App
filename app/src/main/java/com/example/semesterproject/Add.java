package com.example.semesterproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Add extends AppCompatActivity {


    private Button submit;
    private EditText product,quantity,discription;

    private RadioButton in,out;

    private FirebaseDatabase myDatabase;
    private DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        //getting firebase instantiate
        myDatabase=FirebaseDatabase.getInstance();
        myRef=myDatabase.getReference().child("semester-project-e7971");


        submit=findViewById(R.id.submit);

        product =findViewById(R.id.product);
        quantity=findViewById(R.id.quantity);
        discription=findViewById(R.id.discription);
        in=findViewById(R.id.in);
        out=findViewById(R.id.out);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //calling the textview data to store in string

                String p=product.getText().toString();
                String q=quantity.getText().toString();
                String d=discription.getText().toString();


                HashMap value=new HashMap();
                value.put("product",p);
                value.put("quantity",q);
                value.put("discription",d);

                myRef.updateChildren(value).addOnCompleteListener(new OnCompleteListener()
                {
                    @Override
                    public void onComplete(@NonNull Task task) {

                        if (task.isSuccessful()) {


                            Toast.makeText(Add.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                             }


                    }

                    });

            }
        });





    }
}


                //myRef.setValue(data);





               // Intent a = new Intent(Add.this,.class);
                //startActivity(a);










