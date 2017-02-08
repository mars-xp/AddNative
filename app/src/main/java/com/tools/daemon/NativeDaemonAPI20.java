package com.tools.daemon;

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
			System.loadLibrary("dm_api20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public native void doDaemon(String pkgName, String svcName, String daemonPath);
	
}
