package com.ossovita.databindingintro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ossovita.databindingintro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

       User user = new User("Yours truly",16,true,"https://upload.wikimedia.org/wikipedia/commons/b/be/Alan_Cox.jpg");
       activityMainBinding.setUser(user);

       activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, user.getName(), Toast.LENGTH_SHORT).show();
           }
       });
    }
}