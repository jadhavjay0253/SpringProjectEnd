package com.cts.locn.Service;

import java.util.List;

import com.cts.locn.Entity.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocById(int id);

	List<Location> getAllLocation();

}
