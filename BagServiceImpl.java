package com.tutorial.business;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.tutorial.bean.Bag;
import com.tutorial.bean.Flight;
import com.tutorial.bean.Terminal;
import com.tutorial.util.ApplicationConstants;

public class BagServiceImpl implements BagService
{
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Map<Flight, Map<Terminal,Set<Bag>>> getBagList() throws Exception
	{
		
		Map<Flight, Map<Terminal,Set<Bag>>> bagMap = new HashMap<>();
		
		for(int count = 1; count <= 20; count++ )
		{
			Random rn = new Random();
			long value = count;
			
			rn = new Random();
			long ranValue = rn.nextInt(10) + 1;
			
			String flightName = "UA" + ranValue;
			
			if(ranValue % 5 == 0)
			{
				flightName = ApplicationConstants.ARRIVAL;
			}
			
			
			String terminal = "A" + ranValue;
			
			
			Flight flight = new Flight(flightName, flightName);
			Set<Bag> bagSet = new HashSet<>();
			
			if(bagMap.containsKey(flight))
			{
				
				Map<Terminal,Set<Bag>> terminalMap = bagMap.get(flight);
				 
				if(terminalMap.containsKey(terminal))
				{
					bagSet = terminalMap.get(terminal);
				}
				else
				{
					bagSet = new HashSet<>();
					terminalMap.put(new Terminal(terminal), bagSet);
				}
				bagSet.add(new Bag(value, new Terminal(terminal),flight, count ));
			}
			else
			{
				bagSet = new HashSet<>();
				bagSet.add(new Bag(value, new Terminal(terminal),flight , count));
				Map<Terminal,Set<Bag>> terminalMap = new HashMap<>();
				terminalMap.put(new Terminal(terminal), bagSet);
				bagMap.put(flight, terminalMap);
			}
		}
		return bagMap;
	}
}
