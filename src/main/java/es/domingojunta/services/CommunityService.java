package es.domingojunta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.domingojunta.entities.Community;
import es.domingojunta.repositories.BuildingRepository;
import es.domingojunta.repositories.CommunityRepository;
import es.domingojunta.repositories.DocumentRepository;
import es.domingojunta.repositories.UserRepository;

@Service
public class CommunityService {

	@Autowired
	private CommunityRepository communityRepository;
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private UserRepository userRepository;
	
	public List<Community> findAll() {
		return communityRepository.findAll();
	}

	public Community findOne(int id) {
		// TODO Auto-generated method stub
		return communityRepository.findOne(id);
	}
	
}
