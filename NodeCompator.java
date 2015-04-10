package com.tutorial.util;

import java.util.Comparator;

import com.tutorial.bean.Node;

public class NodeCompator implements Comparator<Node>
{

	public int compare(Node n1, Node n2)
	{
		if (n1.getInterval() > n2.getInterval())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
