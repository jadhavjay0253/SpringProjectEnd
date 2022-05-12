package com.cts.locn.Repo;

import org.springframework.data.repository.CrudRepository;

import com.cts.locn.Entity.Location;

public interface LocnRepo extends CrudRepository<Location, Integer> {

}
