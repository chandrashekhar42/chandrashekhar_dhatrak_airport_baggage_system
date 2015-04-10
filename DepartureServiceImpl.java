package com.tutorial.business;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.tutorial.bean.Departures;
import com.tutorial.bean.Flight;
import com.tutorial.bean.Terminal;

public class DepartureServiceImpl implements DepartureService
{

	public Map<Flight, Departures> getDepartureMap()throws Exception
	{
		Map<Flight, Departures> departureMap = new HashMap<>();
		
		for(int count = 0; count < 20; count++ )
		{
			Random rn = new Random();
			int answer = rn.nextInt(10) + 1;
			
			String flightName = "UA" + count;
			
			String terminal = "A" + answer;
			
			Calendar cal = Calendar.getInstance();
			
			cal.add(Calendar.HOUR, answer);
			
			Date departureDate = cal.getTime();
			
			Flight flight = new Flight(flightName, flightName);
			
			departureMap.put(flight, new Departures(flight, new Terminal(terminal), departureDate));
		}
		
		Flight flight = new Flight("ARRIVAL", "ARRIVAL");
		departureMap.put(flight, new Departures(flight, new Terminal("ARRIVAL"), new Date()));
		
		return departureMap;
	}
}
