package com.java2.withImranDiscussion;

public class ContainerTree {

	public int data;
	public ContainerTree containerTr;
	
	public ContainerTree(int data){
		this.data = data;
		this.containerTr = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ContainerTree getContainerTr() {
		return containerTr;
	}

	public void setContainerTr(ContainerTree containerTr) {
		this.containerTr = containerTr;
	}
	
	
}
