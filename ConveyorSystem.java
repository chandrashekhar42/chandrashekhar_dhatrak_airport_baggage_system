package com.tutorial.bean;

import java.io.Serializable;
import java.util.List;

public class ConveyorSystem  implements Serializable
{
	private static final long serialVersionUID = -3899338804001130093L;
	
	private Long systemId;
	
	private Terminal terminal;
	
	private List<Node> adjacentTerminalList;
	
	/**
	 * 
	 */
	public ConveyorSystem()
	{
		
	}
	
	/**
	 * 
	 * @param terminal
	 * @param adjacentTerminalList
	 */
	public ConveyorSystem( Terminal terminal,  List<Node>  adjacentTerminalList)
	{
		this.terminal = terminal;
		this.adjacentTerminalList = adjacentTerminalList;
	}

	/**
	 * 
	 * @return
	 */
	public Long getSystemId()
	{
		return systemId;
	}

	/**
	 * 
	 * @param systemId
	 */
	public void setSystemId(Long systemId)
	{
		this.systemId = systemId;
	}

	/**
	 * 
	 * @return
	 */
	public Terminal getTerminal()
	{
		return terminal;
	}

	/**
	 * 
	 * @param terminal
	 */
	public void setTerminal(Terminal terminal)
	{
		this.terminal = terminal;
	}

	/**
	 * 
	 * @return
	 */
	public List<Node> getAdjacentTerminalList()
	{
		return adjacentTerminalList;
	}

	/**
	 * 
	 * @param adjacentTerminalList
	 */
	public void setAdjacentTerminalList(List<Node> adjacentTerminalList)
	{
		this.adjacentTerminalList = adjacentTerminalList;
	}

}
