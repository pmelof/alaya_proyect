package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Ideas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdeasRepository extends MongoRepository<Ideas, Integer> {
}
