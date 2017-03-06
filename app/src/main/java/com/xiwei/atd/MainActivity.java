package com.xiwei.atd;

import android.app.*;
import android.os.*;
import java.util.*;
import android.support.v7.widget.*;
import android.content.*;
import android.support.v7.app.*;

public class MainActivity extends AppCompatActivity
{
	private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toolbar tool = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(tool);
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
	
}
