package com.connect.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText login_email,login_pwd;
    Button btn_login;
    TextView text_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_email=(EditText)findViewById(R.id.login_email);
        login_pwd=(EditText)findViewById(R.id.login_password);

        btn_login=(Button)findViewById(R.id.btnlogin);
        text_reg=(TextView)findViewById(R.id.text_reg);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
            }
        });


    }
}
