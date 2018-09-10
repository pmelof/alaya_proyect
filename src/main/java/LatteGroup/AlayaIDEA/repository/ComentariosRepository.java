package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentariosRepository extends MongoRepository<Comentario, Integer> {
}
