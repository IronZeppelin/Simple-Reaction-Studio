package com.SRstudio.simplereaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.SRstudio.simplereaction.R;

public class ProjectModDevActivity extends Activity implements OnClickListener{
	ImageView header_img;
	TextView head_txt,skyrim_txt,terraria_txt,trackmania_txt;
	Button skyrim_bt_action,terraria_bt_action,trackmania_bt_action;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_mod_dev);
		
		header_img = (ImageView) findViewById(R.id.header_iv);

        
		skyrim_bt_action = (Button) findViewById(R.id.skyrim_bt);
		skyrim_bt_action.setOnClickListener(this);
		
		terraria_bt_action = (Button) findViewById(R.id.terraria_bt);
		terraria_bt_action.setOnClickListener(this);
		
		trackmania_bt_action = (Button) findViewById(R.id.trackmania_bt);
		trackmania_bt_action.setOnClickListener(this);
	}
	 public void onClick(View v) {
	    	switch (v.getId()) {
	        	case R.id.skyrim_bt:
	        		Intent proj_window = new Intent(ProjectModDevActivity.this,ProjectModDevSkyrimActivity.class);
	                 startActivity(proj_window);
	    	}
	    	switch (v.getId()) {
        	case R.id.terraria_bt:
        		Intent proj_window = new Intent(ProjectModDevActivity.this,ProjectModDevTerrariaActivity.class);
                 startActivity(proj_window);
	    	}
	    	switch (v.getId()) {
        	case R.id.trackmania_bt:
        		Intent proj_window = new Intent(ProjectModDevActivity.this,ProjectModDevTrackmaniaActivity.class);
                 startActivity(proj_window);
	    	}
	 }

}
