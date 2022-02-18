package com.collection.loadbalancer;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class RequestCompartor implements Comparator<Client>{

	@Override
	public int compare(Client client1, Client client2) {
		if(client1.getRank()>client2.getClient_id())
			return 1;
		else if(client1.getRank()<client2.getClient_id())
			return -1;
		return 0;
	}
	
}
public class LoadBalancer {
	private PriorityQueue<Client> requests;
	private int servers;
	LoadBalancer(int servers){
		requests=new PriorityQueue<>(new RequestCompartor());
		this.servers=servers;
	}
	
	public void addClient(Client client_data) {
		requests.add(client_data);
	}
	
	public void splitRequest() {
		
	}
}
