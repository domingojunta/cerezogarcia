package es.domingojunta.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Building
 *
 */
@Entity

public class Building implements Serializable {

	
	private static final long serialVersionUid = 1L;

	public Building() {
		super();
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String type;
	private String description;
	
	@ManyToMany(mappedBy="buildings")
	private List<User> users;
	
	@ManyToOne
	@JoinColumn(name="community_id")
	private Community community;

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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	
   
}
