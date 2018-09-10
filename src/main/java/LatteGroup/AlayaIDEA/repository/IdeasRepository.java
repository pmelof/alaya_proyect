package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Ideas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeasRepository extends MongoRepository<Ideas, Integer> {
    public Ideas findIdeaBy(Integer id);
}
