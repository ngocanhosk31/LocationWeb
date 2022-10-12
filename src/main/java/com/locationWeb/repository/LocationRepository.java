package com.locationWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationWeb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
