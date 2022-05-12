package com.cts.locn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.locn.Entity.Location;
import com.cts.locn.Service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping("/create")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap map) {
		Location locnSave = locationService.saveLocation(location);
		String msg = "Location saved with ID: " + locnSave.getId();
		map.addAttribute("msg", msg); // can be accessed by jsp
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLoations(ModelMap map) {
		List<Location> lc = locationService.getAllLocation();
		map.addAttribute("lc", lc);
		return "displayLocations";
	}

	@RequestMapping("/deleteLocation")
	public String deleteById(@RequestParam("id") int id,ModelMap map) { // get from url
		Location locById = locationService.getLocById(id);
		locationService.deleteLocation(locById);
		List<Location> lc = locationService.getAllLocation();
		map.addAttribute("lc", lc);
		return "displayLocations";
	}

}
