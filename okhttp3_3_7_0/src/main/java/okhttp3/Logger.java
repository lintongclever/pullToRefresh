package okhttp3;

import android.util.Log;

import com.secmail.okhttp3_3_7_0.BuildConfig;

/**
 * Created by wangying on 2018/8/14.
 */

public class Logger {
    private static final String TAG="OKHttp";
    public static void i(String msg){
        if (BuildConfig.DEBUG){
            Log.i(TAG,msg);
        }
    }
}
