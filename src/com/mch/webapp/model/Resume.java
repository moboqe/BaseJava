package com.mch.webapp.model;

import java.util.Objects;

/**
 * Initial resume class
 */
public class Resume {

	// Unique identifier
	private String uuid;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public String toString() {
		return uuid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(uuid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Resume other = (Resume) obj;
		return Objects.equals(uuid, other.uuid);
	}



	
}
