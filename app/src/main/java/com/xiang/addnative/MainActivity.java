package com.xiang.addnative;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import io.fabric.sdk.android.Fabric;

/**
 *
 * Created by Mars on 12/24/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        TextView tv = new TextView(this);
        tv.setText("hello world");
        setContentView(tv);

        //you have to start the service once.
        startService(new Intent(MainActivity.this, Service1.class));
    }
}
