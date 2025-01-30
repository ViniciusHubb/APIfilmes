package com.senac.APIfilmes.Repository;

import com.senac.APIfilmes.entity.Filmes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends MongoRepository<Filmes, ObjectId> {
}
