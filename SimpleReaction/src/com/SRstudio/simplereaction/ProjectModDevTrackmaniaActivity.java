package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import com.SRstudio.simplereaction.R;

public class ProjectModDevTrackmaniaActivity extends Activity implements OnClickListener{
	
	Button blazerblade_bt_activity,dirtmongral_bt_activity,fct_bt_activity,
			freeride_bt_activity,worlo_round_bt_activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_mod_dev_trackmania);
		
		blazerblade_bt_activity = (Button) findViewById(R.id.blazeblade_bt);
		blazerblade_bt_activity.setOnClickListener(this);
		
		dirtmongral_bt_activity = (Button) findViewById(R.id.dirtmong_bt);
		dirtmongral_bt_activity.setOnClickListener(this);
		
		fct_bt_activity = (Button) findViewById(R.id.fct_bt);
		fct_bt_activity.setOnClickListener(this);
		
		freeride_bt_activity = (Button) findViewById(R.id.freeRide_bt);
		freeride_bt_activity.setOnClickListener(this);
		
		worlo_round_bt_activity = (Button) findViewById(R.id.WorlORound_bt);
		worlo_round_bt_activity.setOnClickListener(this);
	}
	
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
	public void onClick(View v) {
    	switch (v.getId()) {
        	case R.id.blazeblade_bt:
        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/05/10/trackmania-map-blazzer-and-blade/");
				break;
        	case R.id.dirtmong_bt:
        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/04/05/trackmania-map-dirt-mongrels/");
				break;
        	case R.id.fct_bt:
        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/04/10/trackmania-map-first-class-travel/");
				break;
        	case R.id.freeRide_bt:
        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/03/24/new-trackmania-2-stadim-map/");
				break;
        	case R.id.WorlORound_bt:
        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/03/24/trackmania-map-worlo-round/");
				break;
    	}

	}

}
