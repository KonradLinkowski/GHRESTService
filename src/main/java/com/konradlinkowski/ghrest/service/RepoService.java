package com.konradlinkowski.ghrest.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.konradlinkowski.ghrest.model.Repo;

@Service
public class RepoService {

	private final String githubUrl = "https://api.github.com";
	
	private final RestTemplate restTemplate;

    public RepoService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
	
	@Async
    public CompletableFuture<Repo> getRepo(String userName, String repoName) throws InterruptedException {
        String url = String.format("%s/repos/%s/%s", githubUrl, userName, repoName);
        System.out.println(url);
        Repo results = restTemplate.getForObject(url, Repo.class);
        return CompletableFuture.completedFuture(results);
    }
}
