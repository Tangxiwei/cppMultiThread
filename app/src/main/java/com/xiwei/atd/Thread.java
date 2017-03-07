package com.xiwei.atd;
import android.support.v7.app.*;
import android.os.*;
import android.app.*;
import android.widget.*;

public class Thread extends AppCompatActivity
{
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread);
		TextView Text = (TextView)findViewById(R.id.thread_text1);
		android.support.v7.app.ActionBar action = getSupportActionBar();
		if (action != null){action.setDisplayHomeAsUpEnabled(true);}
		Text.setText("std::thread的构造函数有3个，其中没有复制构造函数，有移动语义构造函数"+
		"thread(); thread( thread&& other );  template< class Function, class... Args >explicit thread( Function&& f, Args&&... args );  thread(const thread&) = delete;");
	}
}
