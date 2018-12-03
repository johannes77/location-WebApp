package com.jojo.clt.location.service;

import java.util.List;

import com.jojo.clt.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(int id);
	Location getLocationById(int id);
	List<Location> getAllLocation();
	

}
