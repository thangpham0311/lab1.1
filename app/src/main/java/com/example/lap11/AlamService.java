package com.example.lap11;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AlamService extends BroadcastReceiver {
    public AlamService() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("thang", "Receiver Checked!");
        String chuoi_string = intent.getExtras().getString("extra");
        Log.d("bạn truyền key",chuoi_string);

        Intent myIntent = new Intent(context,Music.class);
        myIntent.putExtra("extra",chuoi_string);
        context.startService(myIntent);
    }

}
