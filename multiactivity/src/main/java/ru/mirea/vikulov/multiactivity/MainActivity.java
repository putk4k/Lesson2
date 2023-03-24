package ru.mirea.vikulov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textovichoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNewActivity(View textview_first){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText text1 = (EditText)findViewById(R.id.textovichoc);
        String txt = text1.getText().toString();
        intent.putExtra("key",txt);
        startActivity(intent);

    }
}