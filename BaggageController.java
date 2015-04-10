package com.tutorial.controller;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.tutorial.bean.Bag;
import com.tutorial.bean.Departures;
import com.tutorial.bean.Flight;
import com.tutorial.bean.Route;
import com.tutorial.bean.Terminal;
import com.tutorial.business.BagService;
import com.tutorial.business.BagServiceImpl;
import com.tutorial.business.ConveyorService;
import com.tutorial.business.ConveyorServiceImpl;
import com.tutorial.business.DepartureService;
import com.tutorial.business.DepartureServiceImpl;
import com.tutorial.util.ApplicationConstants;
import com.tutorial.util.BagComparator;

public class BaggageController
{
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		try
		{
			BagService bagService = new BagServiceImpl();
			
			ConveyorService conveyorService = new ConveyorServiceImpl();
			
			DepartureService departureService = new DepartureServiceImpl();
			
			Map<Flight, Map<Terminal,Set<Bag>>> bagMap = bagService.getBagList();
			
			Set<Map.Entry<Flight, Map<Terminal,Set<Bag>>>> bagEntrySet = bagMap.entrySet();
			
			
			Map<Flight, Departures> departureMap = departureService.getDepartureMap();
			
			Set<Bag> bagSet = new TreeSet<>(new BagComparator());
			
			for (Map.Entry<Flight, Map<Terminal,Set<Bag>>> bagEntry : bagEntrySet)
			{
				Flight flight = bagEntry.getKey();
				
				if(departureMap.containsKey(bagEntry.getKey()))
				{
					Departures departures = departureMap.get(bagEntry.getKey());
					
					Map<Terminal,Set<Bag>> terminalMap = bagEntry.getValue();
					Route route = new Route();
					boolean pathFound = false;
					
					for (Map.Entry<Terminal,Set<Bag>> terminalEntry : terminalMap.entrySet())
					{
						if(!pathFound)
						{
							String destination = departures.getDepartureTerminal().getTerminalName();
							
							if(ApplicationConstants.ARRIVAL.equalsIgnoreCase(flight.getFlightId()))
							{
								destination = ApplicationConstants.BAGGAGE_CLAIM;
							}
							route = conveyorService.findShortest( terminalEntry.getKey().getTerminalName(), destination);
							pathFound = true;
						}
						
						for (Bag bag : terminalEntry.getValue())
						{
							bag.setRoute(route);
							bagSet.add(bag);
						}
					}
				}
			}
			
			for (Bag bag : bagSet)
			{
				System.out.println(String.format("%04d",bag.getBagNumber()) + "   " + bag.getRoute().getNodePath() + ":   " + bag.getRoute().getTotalInterval());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
