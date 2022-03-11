package com.lq.inventory;

import java.util.Date;

public class CD extends Item {
	
	private Artist artists;
	private Date releaseDate;
	
	
	public CD(String title, double price, int quantiy, Artist artists, Date releaseDate) {
		super(title, price, quantiy);
		this.artists = artists;
		this.releaseDate = releaseDate;
	}
	
	public Artist getArtists() {
		return artists;
	}
	public void setArtists(Artist artists) {
		this.artists = artists;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}
