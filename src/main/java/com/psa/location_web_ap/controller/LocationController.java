package com.psa.location_web_ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.location_web_ap.LocationRepos.LocationRep;
import com.psa.location_web_ap.entity.Location;

@Controller
public class LocationController {
	@Autowired
	private LocationRep lor;

	@RequestMapping("/showLocation")
	public String showLocation() {
		return "showLocation";

	} // dono me connet kar skte hai data base ko

	/*
	 * @RequestMapping("/saveLoc") public String saveLoc(@RequestParam("id") long
	 * id,@RequestParam("code") String code,@RequestParam("name") String
	 * name,@RequestParam("type") String type , ModelMap modelMap) { Location
	 * location = new Location(); location.setId(id); location.setCode(code);
	 * location.setName(name); location.setType(type); lor.save(location);
	 */

	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location loc, ModelMap modelMap) {
		lor.save(loc);

		modelMap.addAttribute("msg", "location saved !!");
		return "showLocation";

	}

	@RequestMapping("/getLocations")
	public String getLocations(ModelMap modelmap) {
		List<Location> locations = lor.findAll();
		modelmap.addAttribute("locations", locations);
		return "getLocations";

//	}//not import method create
//	@RequestMapping("/displayLocation")
//	public String displayLocation() {
//		return "getLocations";
//	}
//	@RequestMapping("/newPage")
//	public String newPage() {
//		return"showLocation";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") Long id,ModelMap modelmap) {
		lor.deleteById(id);
		List<Location> locations = lor.findAll();
		modelmap.addAttribute("locations", locations);

		return "getLocations";

	}
	@RequestMapping("/updateLocation")
	public String updateLocation(@RequestParam("id") Long id, ModelMap modelmap) {
		Optional<Location> findById = lor.findById(id);
		Location location = findById.get();
		modelmap.addAttribute("id",location.getId());
		modelmap.addAttribute("Name",location.getName());
		modelmap.addAttribute("Code",location.getCode());
		modelmap.addAttribute("Type",location.getType());

		return"updateTheLocation";
	}
	@RequestMapping("/updateLocationData")
	public String updateLocationData(@ModelAttribute("Location") Location location, ModelMap modelmap) {
		location.setCode(location.getCode());
		location.setName(location.getName());
		location.setType(location.getType());
		lor.save(location);
		modelmap.addAttribute("updateMsg","Location record is updated");
		return"updateTheLocation";
		
		
		
	}

}
