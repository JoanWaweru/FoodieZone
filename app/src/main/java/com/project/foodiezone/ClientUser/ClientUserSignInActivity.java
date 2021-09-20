package com.project.foodiezone.ClientUser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.database.core.view.View;
import com.project.foodiezone.R;

public class ClientUserSignInActivity extends AppCompatActivity {
    Button clientUserSignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_user_sign_in);

        clientUserSignUpBtn = findViewById(R.id.btn_client_user_Sign_up);
    }

    public void clientUserSignUp(android.view.View view) {
        Intent signUp = new Intent(ClientUserSignInActivity.this,ClientUserSignUpActivity.class);
        startActivity(signUp);
    }
}