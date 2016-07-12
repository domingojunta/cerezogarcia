package es.domingojunta.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity

public class Document implements Serializable {

	
	private static final long serialVersionUid = 1L;

	public Document() {
		super();
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String title;
	private String type;
	private String date;
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name="community_id")
	private Community community;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	
	
	
   
}
