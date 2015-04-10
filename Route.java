package com.tutorial.bean;

import java.io.Serializable;

public class Route  implements Serializable
{
	private static final long serialVersionUID = 525650395731828989L;
	
	private Long routeId;
	
	private String nodePath;
	
	private Integer totalInterval;

	/**
	 * 
	 * @return
	 */
	public Long getRouteId()
	{
		return routeId;
	}

	/**
	 * 
	 * @param routeId
	 */
	public void setRouteId(Long routeId)
	{
		this.routeId = routeId;
	}

	/**
	 * 
	 * @return
	 */
	public String getNodePath()
	{
		return nodePath;
	}

	/**
	 * 
	 * @param nodePath
	 */
	public void setNodePath(String nodePath)
	{
		this.nodePath = nodePath;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getTotalInterval()
	{
		return totalInterval;
	}

	/**
	 * 
	 * @param totalInterval
	 */
	public void setTotalInterval(Integer totalInterval)
	{
		this.totalInterval = totalInterval;
	}
}
