package com.SRstudio.simplereaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import com.SRstudio.simplereaction.R;

public class Projects extends Activity implements OnClickListener{
	Button prog_web_bt_action,prog_app_bt_action,
	prog_mod_bt_action,prog_art_bt_action,prog_back_bt_action;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projects);
		
		prog_web_bt_action = (Button) findViewById(R.id.proj_web_design);
		prog_web_bt_action.setOnClickListener(this);
		
		prog_app_bt_action = (Button) findViewById(R.id.proj_app_dev);
		prog_app_bt_action.setOnClickListener(this);
		
		prog_mod_bt_action = (Button) findViewById(R.id.proj_mods);
		prog_mod_bt_action.setOnClickListener(this);
		
		prog_art_bt_action = (Button) findViewById(R.id.proj_art);
		prog_art_bt_action.setOnClickListener(this);
		
	}
	
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
	 public void onClick(View v) {
	    	switch (v.getId()) {
	        	case R.id.proj_web_design:
	        		 Intent proj_web_window = new Intent(Projects.this,ProjectWebDesigActivity.class);
	                 startActivity(proj_web_window);
	        		break;
	        	case R.id.proj_app_dev:
	        		Intent app_dev_window = new Intent(Projects.this,AppDevActivity.class);
	                 startActivity(app_dev_window);
	        		break;
	        	case R.id.proj_mods:
	        		Intent mod_window = new Intent(Projects.this,ProjectModDevActivity.class);
	                 startActivity(mod_window);
	        		break;
	        	case R.id.proj_art:
	        		LaunchBrowser("http://simplemindblog.wordpress.com/2013/05/10/trackmania-map-blazzer-and-blade/");
					break;
	    	}
 	}

}
