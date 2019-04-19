package ro.pub.cs.systems.eim.practicaltest01var07;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.EditText;

public class StartedServiceBroadcastReceiver extends BroadcastReceiver {

	EditText editText1, editText2, editText3, editText4;

	public StartedServiceBroadcastReceiver() {
	}

	public StartedServiceBroadcastReceiver(EditText editText1, EditText editText2, EditText editText3, EditText editText4) {
		this.editText1 = editText1;
		this.editText2 = editText2;
		this.editText3 = editText3;
		this.editText4 = editText4;
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO: This method is called when the BroadcastReceiver is receiving
		// an Intent broadcast.
		if (intent.getAction().equals("randnumbers")) {
			//TODO: Do stuff
			Log.i("Receiver", "got intent with numbers");
			editText1.setText(intent.getStringExtra("r1"));
			editText2.setText(intent.getStringExtra("r2"));
			editText3.setText(intent.getStringExtra("r3"));
			editText4.setText(intent.getStringExtra("r4"));
		}
	}
}
