package com.seriouscompany.progressbartest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class LoadingBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_bar_test);
    }


    public void showLoadingBar(View v) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("로그인중입니다");
        progressDialog.show();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
                Toast.makeText(LoadingBarActivity.this, "로그인되었습니다", Toast.LENGTH_SHORT).show();


            }
        }, 5000);
    }
}
