package xmlweb.projekat.model.dtos;

import java.util.List;

import xmlweb.projekat.model.BonusService;
import xmlweb.projekat.model.Comment;
import xmlweb.projekat.model.Location;
import xmlweb.projekat.model.Picture;

public class AvailableAccomodationDTO {
	
	private long id;
	private String name;
	private String type;
	private int category;
	private List<BonusService> bonusServices;
	private List<Comment> comments;
	private int price;
	private Location location;
	private List<Picture> pictures;
	
	public AvailableAccomodationDTO(long id, String name, String type, int category, List<BonusService> bonusServices,
			List<Comment> comments, int price, Location location, List<Picture> pictures) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.bonusServices = bonusServices;
		this.comments = comments;
		this.price = price;
		this.location = location;
		this.pictures = pictures;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public List<BonusService> getBonusServices() {
		return bonusServices;
	}
	public void setBonusServices(List<BonusService> bonusServices) {
		this.bonusServices = bonusServices;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
