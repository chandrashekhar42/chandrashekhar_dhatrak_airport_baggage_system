package com.tutorial.business;

import java.util.Map;
import java.util.Set;

import com.tutorial.bean.Bag;
import com.tutorial.bean.Flight;
import com.tutorial.bean.Terminal;

public interface BagService
{
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Map<Flight, Map<Terminal,Set<Bag>>> getBagList() throws Exception;
}
