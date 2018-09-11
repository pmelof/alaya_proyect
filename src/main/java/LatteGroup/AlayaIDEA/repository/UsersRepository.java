package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {

    public Users findUsuarioById(Integer id);
    public Users findUsuarioByCorreo(String correo);

}
