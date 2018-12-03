package com.jojo.clt.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.clt.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
