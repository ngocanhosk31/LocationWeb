package com.locationWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationWeb.entities.Location;
import com.locationWeb.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location savedLocation = service.saveLocation(location);
		String msg = "Location saved with id: " + savedLocation.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
		
	}
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> allLocation = service.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		return"displayLocations";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam int id, ModelMap modelMap) {
//		Location locationById = service.getLocationById(id);
		Location locationById = new Location();
		locationById.setId(id);
		service.deleteLocation(locationById);
		List<Location> allLocation = service.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		return"displayLocations";
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam int id, ModelMap modelMap) {
		Location locationById = service.getLocationById(id);
		modelMap.addAttribute("location", locationById);
		return "editLocation";
	}
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute Location location, ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> allLocation = service.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		return "displayLocations";
	}

}
