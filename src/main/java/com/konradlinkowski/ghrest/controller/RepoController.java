package com.konradlinkowski.ghrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konradlinkowski.ghrest.model.Repo;
import com.konradlinkowski.ghrest.service.RepoService;

@RestController
public class RepoController {
	@Autowired
	private RepoService repoService;
	
	@RequestMapping("/test")
	public Repo getUsers() throws InterruptedException, ExecutionException {
		CompletableFuture<Repo> repo = repoService.getRepo("KonradLinkowski", "Scricher");
        return repo.get();
	}
}
