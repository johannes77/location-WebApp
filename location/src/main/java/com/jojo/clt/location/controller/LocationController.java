package com.jojo.clt.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jojo.clt.location.entities.Location;
import com.jojo.clt.location.service.LocationService;
import com.jojo.clt.location.util.EmailUtil;
import com.jojo.clt.location.util.StudentValidation;

@Controller
public class LocationController {
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	LocationService locationService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String showCreate(@ModelAttribute("location") Location location, ModelMap modelMap) {
		String msg = "";
		if (StudentValidation.isValid(location.getEmail())) {
			Location locationSeved = locationService.saveLocation(location);
			msg = "Location Saved by :" + locationSeved.getId();
		} else {
			msg = "please Enter Valid Email";
		}
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("jtedla77@gmail.com", "Location", "suesseccfuly location created");
		return "createLocation";

	}

	@RequestMapping("/displayLocations")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("location", locations);
		return "displayLocations";

	}

	@RequestMapping("deletLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		locationService.deleteLocation(id);
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("location", locations);
		return "displayLocations";
	}

	@RequestMapping("/showUpdate")
	public String showUpdateLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = locationService.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";

	}

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("location", locations);
		return "displayLocations";

	}
}
