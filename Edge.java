package com.tutorial.bean;

public class Edge
{
	private final Node node1, node2;
	private final int interval;
	
	private String path;

	/**
	 * 
	 * @param node1
	 * @param node2
	 * @param distance
	 */
	public Edge(Node node1, Node node2, int interval)
	{
		this.node1 = node1;
		this.node2 = node2;
		this.interval = interval;
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public Node getAdjacentNode(Node node)
	{
		return node.getValue() != node1.getValue() ? node1 : node2;
	}

	/**
	 * 
	 * @return
	 */
	public int getInterval()
	{
		return interval;
	}

	/**
	 * 
	 * @return
	 */
	public String getPath()
	{
		return path;
	}

	/**
	 * 
	 * @param path
	 */
	public void setPath(String path)
	{
		this.path = path;
	}
}
