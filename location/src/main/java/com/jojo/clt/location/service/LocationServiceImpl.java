package com.jojo.clt.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jojo.clt.location.entities.Location;
import com.jojo.clt.location.repository.LocationRepository;
import com.jojo.clt.location.util.StudentValidation;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(int id) {
		locationRepository.deleteById(id);

	}

	@Override
	public Location getLocationById(int id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

}
