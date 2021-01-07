package com.gao.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fragment2为activity_main中NavHostFragment的id
        NavController navController = Navigation.findNavController(this,R.id.fragment2);
        //设置ActionBar使用Navigation导航
        NavigationUI.setupActionBarWithNavController(this, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {

        NavController navController = Navigation.findNavController(this,R.id.fragment2);
        return navController.navigateUp(); //返回上一层
         //return super.onSupportNavigateUp();
    }
}