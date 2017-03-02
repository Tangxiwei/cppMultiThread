package com.xiwei.atd;

import android.app.*;
import android.os.*;
import java.util.*;
import android.support.v7.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
	private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
