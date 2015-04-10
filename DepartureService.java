package com.tutorial.business;

import java.util.List;
import java.util.Map;

import com.tutorial.bean.Departures;
import com.tutorial.bean.Flight;

public interface DepartureService
{
	public Map<Flight, Departures> getDepartureMap()throws Exception;
}
