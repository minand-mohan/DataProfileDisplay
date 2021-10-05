package com.example.dataprofiledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private TextView Back;
    private Button RegisterButton;
    private EditText regUsername,regFullName,regEmail,regPassword,regPhoneNo;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initializeUIViews();

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserDataHelperClass userData = new UserDataHelperClass(regUsername,regFullName,regEmail,regPassword,regPhoneNo);
                rootNode =FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Users");
                reference.child(userData.getUserNumber()).setValue(userData);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RegisterActivity.this, DashboardActivity.class));
            }
        });
    }

    private void initializeUIViews(){
        Back = (TextView)findViewById(R.id.tvBackRegister);
        regUsername = (EditText)findViewById(R.id.etUsernameRegister);
        regEmail = (EditText)findViewById(R.id.etEmailRegister);
        regPassword = (EditText)findViewById(R.id.etPasswordRegister);
        regPhoneNo = (EditText)findViewById(R.id.etPhoneRegister);
        regFullName = (EditText)findViewById(R.id.etFullNameRegister);
        RegisterButton = (Button)findViewById(R.id.btnRegisterRegister);
    }

}