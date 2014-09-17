package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import com.SRstudio.simplereaction.R;


public class AppDevActivity extends Activity implements OnClickListener{
	ImageButton bit_con_link, studio_link;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_dev);
		
		bit_con_link = (ImageButton) findViewById(R.id.gp_bit_con);
		bit_con_link.setOnClickListener(this);
		
		studio_link = (ImageButton) findViewById(R.id.gp_studio);
		studio_link.setOnClickListener(this);
	}
	public void onClick(View v) {
    	switch (v.getId()) {
        	case R.id.gp_bit_con:
        		Intent intent_bit_con = new Intent(Intent.ACTION_VIEW);
        		intent_bit_con.setData(Uri.parse("market://details?id=com.SRstudio.bitconverter"));
        		startActivity(intent_bit_con);
        		break;
        	case R.id.gp_studio:
        		Intent intent_studio = new Intent(Intent.ACTION_VIEW);
        		intent_studio.setData(Uri.parse("market://details?id=com.SRstudio.simplereaction"));
        		startActivity(intent_studio);
        		break;
    	}
	}

}

