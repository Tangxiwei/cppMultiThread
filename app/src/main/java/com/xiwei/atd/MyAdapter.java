package com.xiwei.atd;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.view.View.*;
import android.content.*;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{
	private List<String> name_list;

	public Context context;
    static class ViewHolder extends RecyclerView.ViewHolder
	{
		View item_view;
		TextView text;
		public ViewHolder(View view)
		{
			super(view);
			item_view = view;
			text =(TextView) view.findViewById(R.id.tv_name);
			//从layout_item加载,所以是item的textView
		}
	}
	public MyAdapter(List<String> name)
	{
		name_list = name;
	}
	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		
		View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item
		,parent,false);
		 final ViewHolder holder = new ViewHolder(item);
		holder.item_view.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v)
			{
				switch (holder.text.getText().toString())
				{
					case "thread":
						Intent intent = new Intent(v.getContext(),Thread.class);
						v.getContext().startActivity(intent);
						
					break;
				}
			}
		});
		return holder;
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position)
	{
		String name = name_list.get(position);
		holder.text.setText(name);
	}

	@Override
	public int getItemCount()
	{
		return name_list.size();
	}

	
}
