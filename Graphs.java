package com.tutorial.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphs
{

	private final Map<Node, ArrayList<Edge>> map;
	
	/**
	 * 
	 */
	public Graphs()
	{
		this.map = new HashMap<Node, ArrayList<Edge>>();
	}

	/**
	 * 
	 * @param node1
	 * @param node2
	 * @param distance
	 */
	public void addEdge(Node node1, Node node2, int interval)
	{

		if (node1 == null || node2 == null)
		{
			throw new NullPointerException("Either of the 2 nodes is null.");
		}
		if (interval < 0)
		{
			throw new IllegalArgumentException(
					" The interval cannot be negative. ");
		}

		Edge edge = new Edge(node1, node2, interval);

		addToMap(node1, edge);
		addToMap(node2, edge);
	}

	/**
	 * 
	 * @param node
	 * @param edge
	 */
	private void addToMap(Node node, Edge edge)
	{
		if (map.containsKey(node))
		{
			List<Edge> l = map.get(node);
			l.add(edge);
		}
		else
		{
			List<Edge> l = new ArrayList<Edge>();
			l.add(edge);
			map.put(node, (ArrayList<Edge>) l);
		}
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public List<Edge> getAdj(Node node)
	{
		return map.get(node);
	}

	/**
	 * 
	 * @return
	 */
	public Map<Node, ArrayList<Edge>> getGraph()
	{
		return map;
	}

}
