package com.psa.location_web_ap.LocationRepos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psa.location_web_ap.entity.Location;

public interface LocationRep extends JpaRepository<Location, Long> {
	

}
