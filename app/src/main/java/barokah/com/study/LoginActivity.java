package barokah.com.study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_login );
    }


    public void doregister (View view)
    {
        Intent pindehkeregister =new Intent (getApplicationContext (),
                RegisterActivity.class);
        startActivity(pindehkeregister);
    }


    public void Nextpage(View view) {

        Intent pindahkeMain =new Intent (getApplicationContext (),
                MainActivity.class);
        startActivity (pindahkeMain);
    }
}
