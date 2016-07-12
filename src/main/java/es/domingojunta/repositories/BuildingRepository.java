package es.domingojunta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.domingojunta.entities.Building;

public interface BuildingRepository extends JpaRepository<Building, Integer> {

	
}
