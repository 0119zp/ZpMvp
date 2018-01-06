package mvp.zp.zpmvp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import mvp.zp.zpmvp.login.ZpLoginActivity;
import mvp.zp.zpmvp.utils.MLog;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void denglu(View view){
        Intent intent = new Intent(MainActivity.this, ZpLoginActivity.class);
        startActivity(intent);
    }





}
