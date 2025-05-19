package com.example.studentdatamodel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentInfoActivity extends AppCompatActivity {

    TextView textFullName, textStudentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        textFullName = findViewById(R.id.textFullName);
        textStudentId = findViewById(R.id.textStudentId);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String studentId = intent.getStringExtra("studentId");

        textFullName.setText("Name : " + firstName + " " + lastName);
        textStudentId.setText("Student Code : " + studentId);
    }
}
