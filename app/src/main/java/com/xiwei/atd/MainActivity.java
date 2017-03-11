package com.xiwei.atd;

import android.app.*;
import android.os.*;
import java.util.*;
import android.support.v7.widget.*;
import android.content.*;
import android.support.v7.app.*;
import android.view.*;
import android.support.v4.widget.*;
import android.support.v4.view.*;

public class MainActivity extends BaseActivity
{
	private DrawerLayout mDraw ;
	private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toolbar tool = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(tool);
	    mDraw = (DrawerLayout)findViewById(R.id.drawlayout);
		android.support.v7.app.ActionBar action = getSupportActionBar();
		if (action != null){action.setDisplayHomeAsUpEnabled(true);
		action.setHomeAsUpIndicator(R.drawable.ic_menu);}
		initData();
		RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
		LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
		recycler.setLayoutManager(layoutmanager);
		MyAdapter adapter = new MyAdapter(list);
		recycler.setAdapter(adapter);
    }
	private void initData()
	{
		list.add(new String("thread")) ;
		list.add(new String("mutex")) ;
		list.add(new String("condtion_variable")) ;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.toolbar,menu);
		return true;
	}
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case android.R.id.home :
				mDraw.openDrawer(GravityCompat.START);
				break;
			default:
		}
		return true;
	}
	
	
}
