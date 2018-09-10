package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, Integer> {
}
