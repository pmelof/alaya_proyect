package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Reto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RetoRepository extends MongoRepository<Reto, Integer>
{
    public Reto findRetoById(String id);
    public Reto findRetoByTitulo(String id);
}
