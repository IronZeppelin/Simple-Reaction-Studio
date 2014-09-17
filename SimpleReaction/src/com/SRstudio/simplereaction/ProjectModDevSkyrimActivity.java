package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import com.SRstudio.simplereaction.R;

public class ProjectModDevSkyrimActivity extends Activity implements OnClickListener{
	ImageView header_img;
	TextView title_skyrim_activity,title_bookmaster_activity,bm_desc_activity;
	Button bookmaster_bt_activity;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_mod_dev_skyrim);
		
		header_img = (ImageView) findViewById(R.id.header_iv);

        
		bookmaster_bt_activity = (Button) findViewById(R.id.bm_bt);
		bookmaster_bt_activity.setOnClickListener(this);
	}
	
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
	public void onClick(View v) {
    	switch (v.getId()) {
        	case R.id.bm_bt:
        		LaunchBrowser("http://steamcommunity.com/sharedfiles/filedetails/?id=164366748");
				break;
    	}

	}
}
