package com.liangxiao.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Dialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						progressDialog = new Dialog(MainActivity.this,
								R.style.progress_dialog);
						progressDialog.setContentView(R.layout.dialog);
						progressDialog.setCancelable(true);
						progressDialog.getWindow()
								.setBackgroundDrawableResource(
										android.R.color.transparent);
						TextView msg = (TextView) progressDialog
								.findViewById(R.id.id_tv_loadingmsg);
						msg.setText("¬Ù¡¶º”‘ÿ÷–");
						progressDialog.show();
					}
				});
	}

	public void cancel() {
		progressDialog.dismiss();
	}
}
