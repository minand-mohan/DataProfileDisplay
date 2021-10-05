package com.example.dataprofiledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView Logo, SignUp;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initializeUIViews();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, RegisterActivity.class));
            }
        });

    }

    private void initializeUIViews(){
        Logo = (TextView)findViewById(R.id.tvTitleDashboard);
        SignUp = (TextView)findViewById(R.id.tvRegisterDasboard);
        Login = (Button)findViewById(R.id.btnLoginDashboard);
    }
}