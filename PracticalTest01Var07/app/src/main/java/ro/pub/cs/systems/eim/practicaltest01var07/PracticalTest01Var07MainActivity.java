package ro.pub.cs.systems.eim.practicaltest01var07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

	EditText editText1, editText2, editText3, editText4;
	Button button_set;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test01_var07_main);

		editText1 = findViewById(R.id.editText1);
		editText2 = findViewById(R.id.editText2);
		editText3 = findViewById(R.id.editText3);
		editText4 = findViewById(R.id.editText4);

		button_set = findViewById(R.id.button_set);
	}
}
