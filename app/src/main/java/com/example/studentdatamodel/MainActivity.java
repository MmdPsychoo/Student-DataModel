package com.example.studentdatamodel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editFirstName, editLastName, editStudentId;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editStudentId = findViewById(R.id.editStudentId);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();
                String studentId = editStudentId.getText().toString();

                Intent intent = new Intent(MainActivity.this, StudentInfoActivity.class);
                intent.putExtra("firstName", firstName);
                intent.putExtra("lastName", lastName);
                intent.putExtra("studentId", studentId);
                startActivity(intent);
            }
        });

    }
}
