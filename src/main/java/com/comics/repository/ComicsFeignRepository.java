package com.comics.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//url information
//https://gateway.marvel.com:443/v1/public/comics?ts={YOURSECRET}&apikey={YOURPUBLICKEY}&hash={YOURHASH}
//hash = ts+privatekey+publickey


@FeignClient(value = "ComicsFromApi", url = "https://gateway.marvel.com:443/v1/public/comics?ts=secret&apikey=2bba4fae624d23be14ad7608a722d094&hash=dc9a65178de0df11e99b0db619306f6b")
public interface ComicsFeignRepository {
	
	@GetMapping
    Object getComics();

	@GetMapping
	Object getComicById(@RequestParam long id);
}
