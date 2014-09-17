package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import com.SRstudio.simplereaction.R;

public class ProjectWebDesigActivity extends Activity implements OnClickListener {
	

	Button web_link_bt_action;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_web_desig);
		
		web_link_bt_action = (Button) findViewById(R.id.webb_act_bt);
		web_link_bt_action.setOnClickListener(this);
	}
	
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
	public void onClick(View v) {
    	switch (v.getId()) {
        	case R.id.webb_act_bt:
        		LaunchBrowser("http://acmttu.org");
				break;
    	}
	}

}
