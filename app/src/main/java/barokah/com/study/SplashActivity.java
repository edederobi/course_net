package barokah.com.study;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );

        Handler h =new Handler ();
        h.postDelayed(new Runnable()
                // pilih java lang
        {
            @Override


            // cara untuk hanya login sekali
            public void run() {
                if (getSharedPreferences("login",0)
                        .contains("DATA NIM")){
                    Intent i = new Intent(getApplicationContext(),
                            LoginActivity.class);
                    startActivity(i);
                    finish();

                } else {

                    Intent i = new Intent(getApplicationContext(),
                            LoginActivity.class);
                    startActivity(i);
                    finish();

                }

            }

        },2000);


    }
}
