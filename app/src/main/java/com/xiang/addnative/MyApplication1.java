package com.xiang.addnative;

import android.content.Context;

import com.tools.daemon.DaemonApplication;
import com.tools.daemon.DaemonConfigurations;


/**
 * Implementation 1<br/>
 * override one method is ok.<br/>
 *
 * Created by Mars on 12/24/15.
 */
public class MyApplication1 extends DaemonApplication {

    /**
     * you can override this method instead of {@link android.app.Application attachBaseContext}
     * @param base
     */
    @Override
    public void attachBaseContextByDaemon(Context base) {
        super.attachBaseContextByDaemon(base);
    }


    /**
     * give the configuration to lib in this callback
     * @return
     */
    @Override
    protected DaemonConfigurations getDaemonConfigurations() {
    	 DaemonConfigurations.DaemonConfiguration configuration1 = new DaemonConfigurations.DaemonConfiguration(
                 "com.xiang.addnative:service",
                 Service1.class.getCanonicalName(),
                 Receiver1.class.getCanonicalName());

         DaemonConfigurations.DaemonConfiguration configuration2 = new DaemonConfigurations.DaemonConfiguration(
                 "com.xiang.addnative:process2",
                 Service2.class.getCanonicalName(),
                 Receiver2.class.getCanonicalName());

         DaemonConfigurations.DaemonListener listener = new MyDaemonListener();
         //return new DaemonConfigurations(configuration1, configuration2);//listener can be null
         return new DaemonConfigurations(configuration1, configuration2, listener);
    }


    class MyDaemonListener implements DaemonConfigurations.DaemonListener{
        @Override
        public void onPersistentStart(Context context) {
        }

        @Override
        public void onDaemonAssistantStart(Context context) {
        }

        @Override
        public void onWatchDaemonDaed() {
        }
    }
}
