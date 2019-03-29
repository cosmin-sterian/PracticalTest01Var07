package ro.pub.cs.systems.eim.practicaltest01var07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {

	private EditText editText1, editText2, editText3, editText4;
	private Button button_sum, button_product;
	private MathClickListener mathClickListener = new MathClickListener();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test01_var07_secondary);

		editText1 = findViewById(R.id.editText1);
		editText2 = findViewById(R.id.editText2);
		editText3 = findViewById(R.id.editText3);
		editText4 = findViewById(R.id.editText4);
		editText1.setKeyListener(null);
		editText2.setKeyListener(null);
		editText3.setKeyListener(null);
		editText4.setKeyListener(null);

		button_sum = findViewById(R.id.button_sum);
		button_product = findViewById(R.id.button_product);
		button_sum.setOnClickListener(mathClickListener);
		button_product.setOnClickListener(mathClickListener);
	}

	class MathClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			int result;
			switch (v.getId()) {
				case R.id.button_sum:
					result = Integer.parseInt(editText1.getText().toString()) +
							Integer.parseInt(editText2.getText().toString()) +
							Integer.parseInt(editText3.getText().toString()) +
							Integer.parseInt(editText4.getText().toString());
					break;

				case R.id.button_product:
					result = Integer.parseInt(editText1.getText().toString()) *
							Integer.parseInt(editText2.getText().toString()) *
							Integer.parseInt(editText3.getText().toString()) *
							Integer.parseInt(editText4.getText().toString());
					break;

				default:
					Log.w("PT01V07SecAct", "another view got in the MathClickListener, aborting");
					return;
			}
			Toast.makeText(PracticalTest01Var07SecondaryActivity.this, "Result is: " + result, Toast.LENGTH_SHORT).show();
		}
	}
}
