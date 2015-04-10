package com.tutorial.bean;

public class Node
{
	private final String terminal;
	private int interval = Integer.MAX_VALUE;
	
	private String path;

	/**
	 * 
	 * @param terminal
	 */
	public Node(String terminal)
	{
		this.terminal = terminal;
	}

	/**
	 * 
	 * @return
	 */
	public String getValue()
	{
		return terminal;
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
	 * @param interval
	 */
	public void setInterval(int interval)
	{
		this.interval = interval;
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((terminal == null) ? 0 : terminal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		Node node = (Node) o;
		return node.getValue() == terminal;
	}
}
