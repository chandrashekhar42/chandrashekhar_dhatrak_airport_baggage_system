package com.tutorial.bean;

import java.io.Serializable;

public class Bag  implements Serializable
{
	private static final long serialVersionUID = 736711539336300965L;
	
	private Long bagId;
	
	private Long bagNumber;
	
	private Terminal entryTerminal;
	
	private Integer bagSequence;
	
	private Route route;
	
	/**
	 * 
	 */
	private Flight flight;
	
	public Bag()
	{
		
	}
	
	/**
	 * @param bagNumber
	 * @param entryTerminal
	 * @param flight
	 */
	public Bag(Long bagNumber, Terminal entryTerminal, Flight flight, Integer bagSequence)
	{
		this.bagNumber = bagNumber;
		this.entryTerminal = entryTerminal;
		this.flight = flight;
		this.setBagSequence(bagSequence);
	}

	/**
	 * @return
	 */
	public Long getBagId()
	{
		return bagId;
	}

	/**
	 * @param bagId
	 */
	public void setBagId(Long bagId)
	{
		this.bagId = bagId;
	}

	/**
	 * @return
	 */
	public Long getBagNumber()
	{
		return bagNumber;
	}

	/**
	 * @param bagNumber
	 */
	public void setBagNumber(Long bagNumber)
	{
		this.bagNumber = bagNumber;
	}

	/**
	 * @return
	 */
	public Terminal getEntryTerminal()
	{
		return entryTerminal;
	}

	/**
	 * @param entryTerminal
	 */
	public void setEntryTerminal(Terminal entryTerminal)
	{
		this.entryTerminal = entryTerminal;
	}

	/**
	 * @return
	 */
	public Flight getFlight()
	{
		return flight;
	}

	/**
	 * @param flight
	 */
	public void setFlight(Flight flight)
	{
		this.flight = flight;
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getBagSequence()
	{
		return bagSequence;
	}

	/**
	 * 
	 * @param bagSequence
	 */
	public void setBagSequence(Integer bagSequence)
	{
		this.bagSequence = bagSequence;
	}
	
	/**
	 * 
	 * @return
	 */
	public Route getRoute()
	{
		return route;
	}

	/**
	 * 
	 * @param route
	 */
	public void setRoute(Route route)
	{
		this.route = route;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bagNumber == null) ? 0 : bagNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bag other = (Bag) obj;
		if (bagNumber == null)
		{
			if (other.bagNumber != null)
				return false;
		}
		else if (!bagNumber.equals(other.bagNumber))
			return false;
		return true;
	}

}
