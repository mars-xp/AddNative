package com.test.kudaemon.nativ;

import com.test.kudaemon.NativeDaemonBase;

import android.content.Context;

/**
 * native code to watch each other when api under 20 (contains 20)
 * @author Mars
 *
 */
public class NativeDaemonAPI20 extends NativeDaemonBase {
	
	public NativeDaemonAPI20(Context context) {
		super(context);
	}

	static{
		try {
			System.loadLibrary("da_api20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public native void doDaemon(String pkgName, String svcName, String daemonPath);
	
}
