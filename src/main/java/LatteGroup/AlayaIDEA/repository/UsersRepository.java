package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Usuario, Integer> {

}
