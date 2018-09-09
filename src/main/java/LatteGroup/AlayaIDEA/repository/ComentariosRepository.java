package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Comentarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentariosRepository extends MongoRepository<Comentarios, Integer> {
}
