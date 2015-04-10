package com.tutorial.business;

import com.tutorial.bean.Graphs;
import com.tutorial.bean.Route;

public interface ConveyorService
{	
	/**
	 * 
	 * @param source
	 * @param destination
	 * @return
	 * @throws Exception
	 */
	public Route findShortest(String source, String destination)throws Exception;
}
