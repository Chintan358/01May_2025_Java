package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="actors")
public class Actors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(
			
			name = "movie_actor",
			joinColumns = @JoinColumn(name="aid"),
			inverseJoinColumns = @JoinColumn(name="mid")
			
			)
	List<Movie> movies;

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

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
	
	
	public void addMovie(Movie movie)
	{
		if(movies==null)
		{
			movies = new ArrayList<Movie>();
		}
		movies.add(movie);
	}
	
	
}
