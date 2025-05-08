package com.amos.firstappspring.controller;

import com.amos.firstappspring.entity.Location;
import com.amos.firstappspring.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    //liste des location
    @RequestMapping("locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocation();
    }

    //location par id
    @RequestMapping("location/{id}")
    public Optional<Location> getLocation(@PathVariable String id) {
        return locationService.getLocation(id);
    }

    //ajouter une location
    @PostMapping("/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }

    //modifier une location
    @PutMapping("/locations/{id}")
    public void updateLocation(@RequestBody Location location, @PathVariable String id) {
        locationService.updateLocation(location, id);
    }

    //delete

    @DeleteMapping("location/{id}")
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }
}
