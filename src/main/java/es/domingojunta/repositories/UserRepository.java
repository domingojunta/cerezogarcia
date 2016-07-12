package es.domingojunta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.domingojunta.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
