package com.alexisg13.ejercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btn;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.user_box);
        password=findViewById(R.id.password_box);
        btn=findViewById(R.id.btn_action);
        content=findViewById(R.id.content_box);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    content.setText(username.getText());
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v){
                content.setText(password.getText());
                return false;
            }
        });


    }



}
