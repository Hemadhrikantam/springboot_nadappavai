package Nadappavai.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Headlines {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String link;
	private String title;
	private String category;
	private String image;
	private String logo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private LocalDateTime saved_date_and_time;

	public LocalDateTime getSaved_date_and_time() {
		return saved_date_and_time;
	}

	@PrePersist
	private void onCreate() {
		saved_date_and_time= LocalDateTime.now();

	}
	
}
	