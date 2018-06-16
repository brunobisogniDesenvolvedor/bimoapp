package br.com.bimo.bimoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn,btnRegister;

    @Override
    protected void attachBaseContext(Context newBase){
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
        .setDefaultFontPath("fonts/Arkhip_font.ttf")
        .setFontAttrId(R.attr.fontPath)
        .build());
        setContentView(R.layout.activity_main);
    }
         //int views


    public Button getBtnRegister() {
        return btnRegister=(Button)findViewById(R.id.btnRegister);
    }

    public Button getBtnSignIn() {
        return btnSignIn=(Button)findViewById(R.id.btnSingIn);
    }
}

