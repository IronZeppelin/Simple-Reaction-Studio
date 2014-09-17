package com.SRstudio.simplereaction;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.SRstudio.simplereaction.R;

public class StudioLinkActivity extends Activity implements OnClickListener {
	Button facebook_bt_action,blog_bt_action,steam_bt_action,deviant_bt_action;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_studio_link);
		
		facebook_bt_action = (Button) findViewById(R.id.studio_facebook_bt);
		facebook_bt_action.setOnClickListener(this);
		
		blog_bt_action = (Button) findViewById(R.id.studio_blog_bt);
		blog_bt_action.setOnClickListener(this);
		
		steam_bt_action = (Button) findViewById(R.id.studio_steam_bt);
		steam_bt_action.setOnClickListener(this);
		
		deviant_bt_action = (Button) findViewById(R.id.studio_deviant_art_bt);
		deviant_bt_action.setOnClickListener(this);
		
	}
	private void LaunchBrowser(String URL){
		Uri theUri = Uri.parse(URL);
		Intent LaunchBrowserIntent = new Intent(Intent.ACTION_VIEW, theUri);
		startActivity(LaunchBrowserIntent);
		}
	
		public void onClick(View v){
			switch(v.getId()){
			case R.id.studio_facebook_bt:
				LaunchBrowser("https://www.facebook.com/pages/Simple-Reaction-Studio/202828256482733");
				break;
			case R.id.studio_blog_bt:
				LaunchBrowser("http://simplemindblog.wordpress.com/");
				break;
			case R.id.studio_steam_bt:
				LaunchBrowser("http://steamcommunity.com/id/bukshot/myworkshopfiles/");
				break;
			case R.id.studio_deviant_art_bt:
				LaunchBrowser("http://bukx.deviantart.com/");
				break;
			}
		}

}
