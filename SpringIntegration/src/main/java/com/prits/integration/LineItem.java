package com.prits.integration;

import java.io.Serializable;

public class LineItem implements Serializable {

	private static final long serialVersionUID = -3079366174476164822L;

	
	private Long id;
	
	private String name;
	
	private int provider;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProvider() {
		return provider;
	}

	public void setProvider(int provider) {
		this.provider = provider;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", provider="
				+ provider + ", status=" + status + "]";
	}

	
	
}
