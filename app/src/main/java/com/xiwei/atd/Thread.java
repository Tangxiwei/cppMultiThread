package com.xiwei.atd;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.os.*;
import android.app.*;
import android.view.*;
import android.widget.TextView;

public class Thread extends AppCompatActivity
{
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread);
		Toolbar tool = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(tool);
		TextView Text = (TextView)findViewById(R.id.thread_text1);
		android.support.v7.app.ActionBar action = getSupportActionBar();
		
		if (action != null){action.setDisplayHomeAsUpEnabled(true);
			action.setHomeAsUpIndicator(R.drawable.ic_menu);}
		Text.setText("std::thread的构造函数有3个，其中没有复制构造函数，有移动语义构造函数"+
		"thread(); thread( thread&& other );  template< class Function, class... Args >explicit thread( Function&& f, Args&&... args );  thread(const thread&) = delete;");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.toolbar,menu);
		return true;
	}
}
