package es.domingojunta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.domingojunta.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
