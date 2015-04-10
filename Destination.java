package com.tutorial.bean;

import java.io.Serializable;

public class Destination  implements Serializable
{

	private static final long serialVersionUID = 2751046403602985546L;
	
	private String destinationCode;
	
	private String destinationName;
	
	private String destinationCity;

	/**
	 * 
	 * @return
	 */
	public String getDestinationCode()
	{
		return destinationCode;
	}

	/**
	 * 
	 * @param destinationCode
	 */
	public void setDestinationCode(String destinationCode)
	{
		this.destinationCode = destinationCode;
	}

	/**
	 * 
	 * @return
	 */
	public String getDestinationName()
	{
		return destinationName;
	}

	/**
	 * 
	 * @param destinationName
	 */
	public void setDestinationName(String destinationName)
	{
		this.destinationName = destinationName;
	}

	/**
	 * 
	 * @return
	 */
	public String getDestinationCity()
	{
		return destinationCity;
	}

	/**
	 * 
	 * @param destinationCity
	 */
	public void setDestinationCity(String destinationCity)
	{
		this.destinationCity = destinationCity;
	}
	
	

}
