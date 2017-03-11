package com.xiwei.atd;
import android.support.v7.app.*;
import android.os.*;
import android.content.*;

public class BaseActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
	}

	@Override
	protected void onDestroy()
	{
		// TODO: Implement this method
		super.onDestroy();
		ActivityCollector.remove(this);
	}
	
}

