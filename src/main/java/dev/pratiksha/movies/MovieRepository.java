package dev.pratiksha.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<movie, ObjectId> {
}
