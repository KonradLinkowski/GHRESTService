package com.konradlinkowski.ghrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.konradlinkowski.ghrest.model.Repo;
import com.konradlinkowski.ghrest.service.RepoService;

@RestController
public class RepoController {
	@Autowired
	private RepoService repoService;
	
	@RequestMapping(value="/repositories/{owner}/{repository-name}", method = RequestMethod.GET)
	public Repo getUsers(@PathVariable("owner") String userName,
			@PathVariable("repository-name") String repoName)
					throws InterruptedException, ExecutionException {
		CompletableFuture<Repo> repo = repoService.getRepo(userName, repoName);
        return repo.get();
	}
}
