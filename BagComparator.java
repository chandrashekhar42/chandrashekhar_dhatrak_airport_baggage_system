package com.tutorial.util;

import java.util.Comparator;

import com.tutorial.bean.Bag;

public class BagComparator implements Comparator<Bag>
{

	public int compare(Bag n1, Bag n2)
	{
		if (n1.getBagSequence() > n2.getBagSequence())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
