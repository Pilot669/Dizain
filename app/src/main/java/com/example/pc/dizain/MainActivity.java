package com.example.pc.dizain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ing;
    private Button btn;
    private EditText email, pass;

    private static final String email_txt = "zalyalovir@list.ru";
    private static final String pass_txt = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login (){
        ing = (ImageView)findViewById(R.id.imageView4);
        btn = (Button)findViewById(R.id.button3);
        email = (EditText)findViewById(R.id.editText6);
        pass = (EditText)findViewById(R.id.editText7);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (email_txt.equals(String.valueOf(email.getText())) && pass_txt.equals(String.valueOf(pass.getText())))
                            ing.setImageResource(R.drawable.images_2);
                        else
                            ing.setImageResource(R.drawable.images_3);
                    }
                }
        );
    }

}
