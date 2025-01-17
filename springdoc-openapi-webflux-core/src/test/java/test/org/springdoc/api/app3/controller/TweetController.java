package test.org.springdoc.api.app3.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import test.org.springdoc.api.app3.dto.TweetDTO;

/**
 * Created by rajeevkumarsingh on 08/09/17.
 */
@RestController
public class TweetController {


	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "get All Tweets") })
	@GetMapping("/tweets")
	public Flux<TweetDTO> getAllTweets() {
		return null;
	}

	@PostMapping("/tweets")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "create Tweets") })
	public Mono<TweetDTO> createTweets(@Valid @RequestBody TweetDTO tweetDTO) {
		return null;
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "get Tweet By Id"),
			@ApiResponse(responseCode = "404", description = "tweet not found") })
	@GetMapping("/tweets/{id}")
	public Mono<ResponseEntity<TweetDTO>> getTweetById(@PathVariable(value = "id") String tweetId) {
		return null;
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "update Tweet"),
			@ApiResponse(responseCode = "404", description = "tweet not found") })
	@PutMapping("/tweets/{id}")
	public Mono<ResponseEntity<TweetDTO>> updateTweet(@PathVariable(value = "id") String tweetId,
			@Valid @RequestBody TweetDTO tweetDTO) {
		return null;
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "delete Tweet"),
			@ApiResponse(responseCode = "404", description = "tweet not found") })
	@DeleteMapping("/tweets/{id}")
	public Mono<ResponseEntity<Void>> deleteTweet(@PathVariable(value = "id") String tweetId) {
		return null;
	}

	@Operation(description = "Tweets are Sent to the client as Server Sent Events", responses = {
			@ApiResponse(responseCode = "200", description = "stream All Tweets") })
	@GetMapping(value = "/stream/tweets", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<TweetDTO> streamAllTweets() {
		return null;
	}

}
