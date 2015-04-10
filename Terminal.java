package com.tutorial.bean;

import java.io.Serializable;

public class Terminal implements Serializable
{
	private static final long serialVersionUID = 5300068818984440060L;
	
	private Integer terminalId;
	
	private String terminalName;
	
	public Terminal()
	{
		
	}
	
	public Terminal(String terminalName)
	{
		this.terminalName = terminalName;
	}

	public Integer getTerminalId()
	{
		return terminalId;
	}

	public void setTerminalId(Integer terminalId)
	{
		this.terminalId = terminalId;
	}

	public String getTerminalName()
	{
		return terminalName;
	}

	public void setTerminalName(String terminalName)
	{
		this.terminalName = terminalName;
	}
}
