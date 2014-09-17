package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import com.SRstudio.simplereaction.R;

public class ProjectModDevTerrariaActivity extends Activity implements OnClickListener {
	
	Button bone_weapon_bt_activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_mod_dev_terraria);
		
		bone_weapon_bt_activity = (Button) findViewById(R.id.bone_mod_bt);
		bone_weapon_bt_activity.setOnClickListener(this);
		
	}
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
	public void onClick(View v) {
    	switch (v.getId()) {
        	case R.id.bone_mod_bt:
        		LaunchBrowser("http://bukx.deviantart.com/gallery/48077776");
				break;
    	}
	}

}
