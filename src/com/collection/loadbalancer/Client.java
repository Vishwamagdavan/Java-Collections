package com.collection.loadbalancer;

public class Client {
	private int client_id;
	private int rank;
	private int request;
	
	public int getRequest() {
		return request;
	}

	public void setRequest(int request) {
		this.request = request;
	}

	Client(int client_id,int rank,int request){
		this.client_id=client_id;
		this.rank=rank;
		this.request=request;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
