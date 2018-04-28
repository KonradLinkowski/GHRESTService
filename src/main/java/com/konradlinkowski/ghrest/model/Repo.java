package com.konradlinkowski.ghrest.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repo {

	private String fullName;
	private String description;
	private String cloneUrl;
	private int stars;
	private Date createdAt;
	
	public Repo() {
	
	}

	public Repo(String fullName, String description, String cloneUrl, int stars, Date createdAt) {
		super();
		this.fullName = fullName;
		this.description = description;
		this.cloneUrl = cloneUrl;
		this.stars = stars;
		this.createdAt = createdAt;
	}

	@JsonProperty("full_name")
	public String getFullName() {
		return fullName;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("clone_url")
	public String getCloneUrl() {
		return cloneUrl;
	}

	@JsonProperty("stargazers_count")
	public int getStars() {
		return stars;
	}

	@JsonProperty("created_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
