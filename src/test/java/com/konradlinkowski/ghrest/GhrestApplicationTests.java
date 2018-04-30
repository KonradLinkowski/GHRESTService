package com.konradlinkowski.ghrest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.CompletableFuture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import com.konradlinkowski.ghrest.model.Repo;
import com.konradlinkowski.ghrest.service.RepoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GhrestApplicationTests {

	@Autowired
	RepoService repoService;
	
	@Test
	public void existingRepoShouldNotBeNull() throws Exception {
		CompletableFuture<Repo> repo = repoService.getRepo("octokit", "octokit.rb");
		assertThat(repo.get()).isNotNull();
	}

	@Test
	public void existingRepoShouldHaveGotSomeVariablesAssigned() throws Exception {
		CompletableFuture<Repo> repoFuture = repoService.getRepo("octokit", "octokit.rb");
		Repo repo = repoFuture.get();
		boolean everyVariableIsNotNull =
				repo.getCloneUrl() != null
				&& repo.getCreatedAt() != null
				&& repo.getFullName() != null;
		assertThat(everyVariableIsNotNull).isTrue();
	}
	
	@Test(expected = HttpClientErrorException.class)
	public void notExistingRepoShouldThrowAnError() throws Exception {
		CompletableFuture<Repo> repoFuture = repoService.getRepo("unexistinggithubname", "ewdasodkaowebtbgfdf31");
		Repo repo = repoFuture.get();
		boolean everyVariableIsNotNull =
				repo.getCloneUrl() != null
				&& repo.getCreatedAt() != null
				&& repo.getFullName() != null;
		assertThat(everyVariableIsNotNull).isFalse();
	}
}
