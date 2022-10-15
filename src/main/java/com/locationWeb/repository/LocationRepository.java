package com.locationWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.locationWeb.entities.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
//	@Query(value = "select * from projectjpa.location_table", nativeQuery = true)
//	public List<Location> findA();
}