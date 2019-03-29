package ro.pub.cs.systems.eim.practicaltest01var07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
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
		button_set.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (v.getId() != R.id.button_set) {
					Log.w("PT01V07MainAct", "another view got in the Set listener");
					return;
				}
				if (!allTextsAreDigitsOnly()) {
					Log.i("PT01V07MainAct", "Not all are digits only");
					return;
				}

				Intent intent = new Intent(PracticalTest01Var07MainActivity.this, PracticalTest01Var07SecondaryActivity.class);
				intent.putExtra("n1", editText1.getText().toString());
				intent.putExtra("n2", editText2.getText().toString());
				intent.putExtra("n3", editText3.getText().toString());
				intent.putExtra("n4", editText4.getText().toString());
				startActivity(intent);
			}
		});
	}

	private boolean allTextsAreDigitsOnly() {
		return TextUtils.isDigitsOnly(editText1.getText().toString()) &
				TextUtils.isDigitsOnly(editText2.getText().toString()) &
				TextUtils.isDigitsOnly(editText3.getText().toString()) &
				TextUtils.isDigitsOnly(editText4.getText().toString());
	}
}
