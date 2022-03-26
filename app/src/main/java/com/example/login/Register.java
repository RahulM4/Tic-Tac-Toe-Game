package com.example.login;

import static com.google.firebase.auth.FirebaseAuth.getInstance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    TextView AlreadyHaveAnaAccount;
    EditText InputEmail,InputPassword,InputConfirmPassword;
    Button RegisterBtn;
    String EmailPattern="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        AlreadyHaveAnaAccount=findViewById(R.id.AlreadyHaveAnAccount);
        InputEmail=findViewById(R.id.Email);
        InputPassword=findViewById(R.id.Password);
        InputConfirmPassword=findViewById(R.id.ConfirmPassword);
        RegisterBtn=findViewById(R.id.Register_btn);
        progressDialog =new ProgressDialog(this);
        mAuth= FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();


        AlreadyHaveAnaAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this,MainActivity.class));

            }
        });




        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformAuth();
            }
        });

    }

    private void PerformAuth() {
        String email = InputEmail.getText().toString();
        String password = InputPassword.getText().toString();
        String confirmPassword = InputConfirmPassword.getText().toString();



        if(!email.matches(EmailPattern))
        {
            InputEmail.setError("Enter correct email!");

        }
        else if(password.isEmpty() || password.length()<7)
        {
            InputPassword.setError("Choose correct password");
        }
        else if(!password.equals(confirmPassword))
        {
            InputConfirmPassword.setError("Password not matched");
        }
        else {
            progressDialog.setMessage("Please wait while registration..😂");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        sendUserToNextActivity();
                        Toast.makeText(Register.this, "Registration has been successfully completed", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        progressDialog.dismiss();
                        Toast.makeText(Register.this, ""+task.getException(), Toast.LENGTH_SHORT).show();

                    }

                }
            });

        }



    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(Register.this,Mygame.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

}