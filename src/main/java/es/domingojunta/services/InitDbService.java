package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.domingojunta.entities.Building;
import es.domingojunta.entities.Community;
import es.domingojunta.entities.Document;
import es.domingojunta.entities.User;
import es.domingojunta.repositories.BuildingRepository;
import es.domingojunta.repositories.CommunityRepository;
import es.domingojunta.repositories.DocumentRepository;
import es.domingojunta.repositories.UserRepository;

@Service
@Transactional
public class InitDbService {

	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private CommunityRepository communityRepository;
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init(){
		
		//Create User's
		
		User user2 = new User();
		user2.setName("Domingo");
		userRepository.save(user2);
		
		User user0 = new User();
		user0.setName("Angel");
		userRepository.save(user0);
		
		User user1= new User();
		user1.setName("Charo");
		userRepository.save(user1);
		
		//Create Building's
		
		Building piso0A = new Building();
		piso0A.setName("BajoA");
		piso0A.setType("vivienda");
		piso0A.setDescription("Lorem Ipsum 0 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		List<User> users = new ArrayList<User>();
		users.add(user0);
		piso0A.setUsers(users);
		buildingRepository.save(piso0A);
		
		Building piso1A = new Building();
		piso1A.setName("PrimeroA");
		piso1A.setType("vivienda");
		piso1A.setDescription("Lorem Ipsum 1 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		List<User> users1 = new ArrayList<User>();
		users1.add(user1);
		piso1A.setUsers(users1);
		buildingRepository.save(piso1A);
		
		Building piso2A = new Building();
		piso2A.setName("PrimeroA");
		piso2A.setType("vivienda");
		piso2A.setDescription("Lorem Ipsum 2 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		List<User> users2 = new ArrayList<User>();
		users2.add(user2);
		piso2A.setUsers(users2);
		buildingRepository.save(piso2A);
		
		//Add building to Users
		
		List<Building> buildings0 = new ArrayList<Building>();
		buildings0.add(piso0A);
		user0.setBuildings(buildings0);
		userRepository.save(user0);
		
		List<Building> buildings1 = new ArrayList<Building>();
		buildings1.add(piso1A);
		user1.setBuildings(buildings1);
		userRepository.save(user1);
		
		List<Building> buildings2 = new ArrayList<Building>();
		buildings2.add(piso2A);
		user2.setBuildings(buildings2);
		userRepository.save(user2);
		
		//Create Community
		
		Community community = new Community();
		community.setName("HistoriadorJaenMorente34");
		List<Building> buildings = new ArrayList<Building>();
		buildings.add(piso0A);
		buildings.add(piso1A);
		buildings.add(piso2A);
		community.setBuildings(buildings);
		community.setDescription("Lorem Ipsum 0 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		communityRepository.save(community);
		
		// Create Document
		
		Document doc0 = new Document();
		doc0.setTitle("Titulo Constitutivo");
		doc0.setCommunity(community);
		doc0.setDescription("Lorem Ipsum 0 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		documentRepository.save(doc0);
		
		Document doc1 = new Document();
		doc1.setTitle("Estatutos");
		doc1.setCommunity(community);
		doc1.setDescription("Lorem Ipsum 0 es simplemente el texto de relleno de las imprentas y archivos de texto.");
		documentRepository.save(doc1);
		
		// Add documents to Community
		
		List<Document> documents = new ArrayList<Document>();
		documents.add(doc0);
		documents.add(doc1);
		community.setDocuments(documents);
		communityRepository.save(community);
	
		
	}
	
}
