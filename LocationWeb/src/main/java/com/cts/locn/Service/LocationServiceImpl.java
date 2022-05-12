package com.cts.locn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.locn.Entity.Location;
import com.cts.locn.Repo.LocnRepo;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocnRepo locnRepo;

	@Override
	public Location saveLocation(Location location) {
		return locnRepo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locnRepo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locnRepo.deleteById(location.getId());
		System.out.println("Deleted successfully..");
	}

	@Override
	public Location getLocById(int id) {
		return locnRepo.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return (List<Location>) locnRepo.findAll();
	}

}
