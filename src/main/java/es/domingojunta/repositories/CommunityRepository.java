package es.domingojunta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.domingojunta.entities.Community;

public interface CommunityRepository extends JpaRepository<Community, Integer>{

}
