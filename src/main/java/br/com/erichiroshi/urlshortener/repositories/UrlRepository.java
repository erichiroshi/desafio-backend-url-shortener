package br.com.erichiroshi.urlshortener.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.erichiroshi.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {

}
