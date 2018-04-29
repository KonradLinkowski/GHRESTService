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

	@JsonProperty("fullName")
	public String getFullName() {
		return fullName;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("cloneUrl")
	public String getCloneUrl() {
		return cloneUrl;
	}

	@JsonProperty("stars")
	public int getStars() {
		return stars;
	}

	@JsonProperty("createdAt")
	public Date getCreatedAt() {
		return createdAt;
	}
	@JsonProperty("full_name")
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonProperty("clone_url")
	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}
	@JsonProperty("stargazers_count")
	public void setStars(int stars) {
		this.stars = stars;
	}
	@JsonProperty("created_at")
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
