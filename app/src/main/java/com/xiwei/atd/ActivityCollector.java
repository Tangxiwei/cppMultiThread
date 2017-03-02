package com.xiwei.atd;
import android.app.*;
import java.util.*;

public class ActivityCollector
{
	public static List<Activity> activities = new ArrayList<>();
	public static void addActivity(Activity a)
	{
		activities.add(a);
	}
	public  static void remove(Activity a)
	{
		activities.remove(a);
	}
	public void finishAll()
	{
		for ( Activity a :activities)
		{
			if (!a.isFinishing())
			{
				a.finish();
			}
		}
	}
}
