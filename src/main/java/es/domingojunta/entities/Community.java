package es.domingojunta.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Community
 *
 */
@Entity

public class Community implements Serializable {

	
	private static final long serialVersionUid = 1L;

	public Community() {
		super();
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String Address;
	private String zip;
	private String city;
	private String provincia;
	private String description;

	@OneToMany(mappedBy="community",fetch=FetchType.EAGER)
	private List<Building> buildings;
	
	@OneToMany(mappedBy="community",fetch=FetchType.EAGER)
	private List<Document> documents;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public List<Building> getBuildings() {
		return buildings;
	}
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
   
}
