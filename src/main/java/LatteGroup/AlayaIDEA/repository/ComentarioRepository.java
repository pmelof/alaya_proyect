package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentarioRepository extends MongoRepository<Comentario, Integer> {
}
