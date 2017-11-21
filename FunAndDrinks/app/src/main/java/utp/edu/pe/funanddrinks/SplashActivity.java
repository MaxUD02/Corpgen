package utp.edu.pe.funanddrinks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by luis on 21/11/2017.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
