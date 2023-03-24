package ru.mirea.vikulov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToast(View view) {
        EditText text1 = (EditText)findViewById(R.id.textInput);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Студент № 6 Группа БСБО-03-20 Количество символов - " + String.valueOf(text1.getText()).length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}