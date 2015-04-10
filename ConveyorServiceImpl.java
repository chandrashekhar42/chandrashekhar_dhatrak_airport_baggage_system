package com.tutorial.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import com.tutorial.bean.Edge;
import com.tutorial.bean.Graphs;
import com.tutorial.bean.Node;
import com.tutorial.bean.Route;
import com.tutorial.util.ApplicationConstants;
import com.tutorial.util.NodeCompator;

public class ConveyorServiceImpl implements ConveyorService
{
	/**
	 * 
	 * @param source
	 * @param destination
	 * @return
	 * @throws Exception
	 */
	public Route findShortest(String source, String destination)throws Exception
	{
		Graphs graph = getConveyorGraph();
		final Queue<Node> queue = new PriorityQueue<Node>(10,
				new NodeCompator());
		
		final Set<Node> doneSet = new HashSet<Node>();
		
		Route route = new Route();
		
		if(source.equalsIgnoreCase(destination))
		{
			Node node = new Node(source);
			route.setNodePath(node.getValue());
			route.setTotalInterval(0);
			
			return route;
		}

		for (Entry<Node, ArrayList<Edge>> entry : graph.getGraph().entrySet())
		{
			Node currNode = entry.getKey();
			if (currNode.getValue().equalsIgnoreCase(source))
			{
				currNode.setInterval(0);
				queue.add(currNode);
				break;
			}
		}
		
		mainLoop:
		while (!queue.isEmpty())
		{
			Node src = queue.poll();
		
			doneSet.add(src);

			for (Edge edge : graph.getAdj(src))
			{
				Node currentNode = edge.getAdjacentNode(src);
				
				currentNode.setPath(src.getValue());

				if (!doneSet.contains(currentNode))
				{
					int newDistance = src.getInterval() + edge.getInterval();
					
					if (newDistance < currentNode.getInterval())
					{
						currentNode.setInterval(newDistance);
						
						if(null == src.getPath())
						{
							src.setPath(src.getValue());
						}
						
						currentNode.setPath(src.getPath() + " " +currentNode.getValue());
						
						queue.add(currentNode);
						
						if(destination.equalsIgnoreCase(currentNode.getValue()))
						{
							break mainLoop;
						}
					}
					else if(destination.equalsIgnoreCase(currentNode.getValue()))
					{
						currentNode.setInterval(newDistance);
						currentNode.setPath(src.getPath() + currentNode.getValue());
						
						queue.add(currentNode);
					}
				}
			}
			
		}		
		
		for (Node node : queue)
		{
			if(destination.equalsIgnoreCase(node.getValue()))
			{
				route.setNodePath(node.getPath());
				
				route.setTotalInterval(node.getInterval());
			}
		}
		return route;
	}
	
	private Graphs getConveyorGraph()throws Exception
	{
		Graphs graphs = new Graphs();
		
		Node a1 = new Node(ApplicationConstants.A1);
		Node a2 = new Node(ApplicationConstants.A2);
		Node a3 = new Node(ApplicationConstants.A3);
		Node a4 = new Node(ApplicationConstants.A4);
		Node a5 = new Node(ApplicationConstants.A5);
		Node a6 = new Node(ApplicationConstants.A6);
		Node a7 = new Node(ApplicationConstants.A7);
		Node a8 = new Node(ApplicationConstants.A8);
		Node a9 = new Node(ApplicationConstants.A9);
		Node a10 = new Node(ApplicationConstants.A10);
		
		Node baggageClaim = new Node(ApplicationConstants.BAGGAGE_CLAIM);
		Node ticketSystem = new Node(ApplicationConstants.TICKET_SYSTEM);
		
		graphs.addEdge(a1, a2, 1);
		graphs.addEdge(a1, a10, 5);
		graphs.addEdge(a2, a3, 4);
		graphs.addEdge(a3, a4, 3);
		graphs.addEdge(a4, a5, 1);
		graphs.addEdge(a5, a6, 2);
		graphs.addEdge(a6, a7, 1);
		graphs.addEdge(a7, a8, 4);
		graphs.addEdge(a8, a9, 5);
		graphs.addEdge(a9, a10, 2);
		
		graphs.addEdge(ticketSystem, a1, 5);
		graphs.addEdge(ticketSystem, a10, 4);
		graphs.addEdge(baggageClaim, a5, 3);
		graphs.addEdge(baggageClaim, a6, 4);
		
		return graphs;
	}

}
