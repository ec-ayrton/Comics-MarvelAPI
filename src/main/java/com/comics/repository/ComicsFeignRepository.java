package com.comics.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//url information
//https://gateway.marvel.com:443/v1/public/comics?ts={YOURSECRET}&apikey={YOURPUBLICKEY}&hash={YOURHASH}
//hash = ts+privatekey+publickey


@FeignClient(value = "ComicsFromApi", url = "${marvelapi.url}")
public interface ComicsFeignRepository {
	
	@GetMapping
    Object getComics();

	@GetMapping
	Object getComicById(@RequestParam long id);
}
