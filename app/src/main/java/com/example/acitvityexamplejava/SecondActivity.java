package com.example.acitvityexamplejava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView message = (TextView) findViewById(R.id.MessageText);
        message.setText(intent.getStringExtra("message"));
    }

    public void returnAnswer(View view) {

        EditText answerText = (EditText) findViewById(R.id.AnswerText);

        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", answerText.getText().toString());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}