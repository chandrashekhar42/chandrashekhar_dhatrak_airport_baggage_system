package com.tutorial.bean;

import java.io.Serializable;
import java.util.Date;

public class Departures  implements Serializable
{
	private static final long serialVersionUID = -4200089760190742055L;
	
	private Long departureId;
	
	private Flight departureFlight;
	
	private Terminal departureTerminal;
	
	private Date departureTime;
	
	/**
	 * 
	 */
	public Departures()
	{
		
	}
	
	/**
	 * 
	 * @param departureFlight
	 * @param departureTerminal
	 * @param departureTime
	 */
	public Departures( Flight departureFlight, Terminal departureTerminal, Date departureTime)
	{
		this.departureFlight = departureFlight;
		this.departureTerminal = departureTerminal;
		this.departureTime = departureTime;
	}

	/**
	 * 
	 * @return
	 */
	public Long getDepartureId()
	{
		return departureId;
	}

	/**
	 * 
	 * @param departureId
	 */
	public void setDepartureId(Long departureId)
	{
		this.departureId = departureId;
	}

	/**
	 * 
	 * @return
	 */
	public Flight getDepartureFlight()
	{
		return departureFlight;
	}

	/**
	 * 
	 * @param departureFlight
	 */
	public void setDepartureFlight(Flight departureFlight)
	{
		this.departureFlight = departureFlight;
	}

	/**
	 * 
	 * @return
	 */
	public Terminal getDepartureTerminal()
	{
		return departureTerminal;
	}

	/**
	 * 
	 * @param departureTerminal
	 */
	public void setDepartureTerminal(Terminal departureTerminal)
	{
		this.departureTerminal = departureTerminal;
	}

	/**
	 * 
	 * @return
	 */
	public Date getDepartureTime()
	{
		return departureTime;
	}

	/**
	 * 
	 * @param departureTime
	 */
	public void setDepartureTime(Date departureTime)
	{
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((departureFlight == null) ? 0 : departureFlight.hashCode());
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
		Departures other = (Departures) obj;
		if (departureFlight == null)
		{
			if (other.departureFlight != null)
				return false;
		}
		else if (!departureFlight.equals(other.departureFlight))
			return false;
		return true;
	}
	
	

}
