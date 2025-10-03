package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(
			
			name = "movie_actor",
			joinColumns = @JoinColumn(name="mid"),
			inverseJoinColumns = @JoinColumn(name="aid")
			
			)
	List<Actors> actors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Actors> getActors() {
		return actors;
	}

	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}
	
	
	public void addActor(Actors actor)
	{
		if(actors==null)
		{
			actors = new ArrayList<Actors>();
		}
		actors.add(actor);
	}
	
}
