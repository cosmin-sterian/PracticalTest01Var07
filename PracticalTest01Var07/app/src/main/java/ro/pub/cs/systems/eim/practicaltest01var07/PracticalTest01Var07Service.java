package ro.pub.cs.systems.eim.practicaltest01var07;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Random;

public class PracticalTest01Var07Service extends Service {
	public PracticalTest01Var07Service() {
	}

	private static final int sleepTime = 10 * 1000;

	boolean running = true;
	Thread thread;

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(running) {
					Random random = new Random();
					int n1 = random.nextInt();
					int n2 = random.nextInt();
					int n3 = random.nextInt();
					int n4 = random.nextInt();
					Intent intent1 = new Intent();
					intent1.putExtra("r1", n1);
					intent1.putExtra("r2", n2);
					intent1.putExtra("r3", n3);
					intent1.putExtra("r4", n4);
					sendBroadcast(intent1);
					try {
						Thread.sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
					}
				}
			}
		});
		thread.start();
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		return null;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
	}
}
