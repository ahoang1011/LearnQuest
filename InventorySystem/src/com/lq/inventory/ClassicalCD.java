package com.lq.inventory;

import java.util.Date;

public class ClassicalCD extends Item {

	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	private int performerCount = 0;
	
	/* A class should never print something. Should send the value to a database.
	 * Would have to use arrayList for something dynamic like performers.
	 */
	public void addPerformer(String performer) {
		
		if(performerCount < performers.length) {
			performers[performerCount++] = performer;
		}
		else {
			System.out.println("Cannot add more to " + getTitle());
		}
	}
	
	public void showPerformers() {
		if(performerCount > 0) {
			for(int i = 0; i < performerCount; i++) {
				System.out.println(performers[i]);
			}
		}
	}
	
	public ClassicalCD(String title, double price, int quantiy, String composer, String[] performers,
			String recordingLocation, Date releaseDate) {
		super(title, price, quantiy);
		this.composer = composer;
		this.performers = performers;
		this.recordingLocation = recordingLocation;
		this.releaseDate = releaseDate;
	}
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String[] getPerformers() {
		return performers;
	}
	public void setPerformers(String[] performers) {
		this.performers = performers;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
