package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>
{
    public Usuario findUsuarioById(String id);
    public Usuario findUsuarioByNombre(String nombre);

}
