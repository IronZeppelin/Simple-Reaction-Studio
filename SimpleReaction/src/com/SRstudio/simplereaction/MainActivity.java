package com.SRstudio.simplereaction;

//import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.SRstudio.simplereaction.R;

public class MainActivity extends Activity implements OnClickListener {
	//create Main Screen Objects
	ImageView header_action;
	TextView display;
	Button project_bt_action,link_bt_action,about_bt_action,contact_bt_action;
	
	//Drop Objects onto screen and load screen with listener.
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        header_action = (ImageView) findViewById(R.id.header_iv);

        
        project_bt_action = (Button) findViewById(R.id.project_bt);
        project_bt_action.setOnClickListener(this);
        
        link_bt_action = (Button) findViewById(R.id.studio_lk_bt);
        link_bt_action.setOnClickListener(this);
        
        about_bt_action = (Button) findViewById(R.id.about_bt);
        about_bt_action.setOnClickListener(this);
        
        contact_bt_action = (Button) findViewById(R.id.contact_bt);
        contact_bt_action.setOnClickListener(this);
        }
    	
	    public void onClick(View v) {
	    	switch (v.getId()) {
	        	case R.id.project_bt:
	        		Intent proj_window = new Intent(MainActivity.this,Projects.class);
	                 startActivity(proj_window);
	        		
	        		break;
	        	case R.id.studio_lk_bt:
	        		Intent stud_link_window = new Intent(MainActivity.this,StudioLinkActivity.class);
	                 startActivity(stud_link_window);
	
	        		break;
	        	case R.id.about_bt:
	        		Intent about_window = new Intent(MainActivity.this,About.class);
	                 startActivity(about_window);;
	        	
	        		break;
	        	case R.id.contact_bt:
	        		Intent contact_window = new Intent(MainActivity.this,ContactActivity.class);
	                 startActivity(contact_window);
	        
	        		break;
	    	}
    	}

}

