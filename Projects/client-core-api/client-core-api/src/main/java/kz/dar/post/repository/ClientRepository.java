package kz.dar.post.repository;


import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    List<ClientEntity> getClientEntitiesBySurname(String surname);

    ClientEntity getClientEntityByClientId(String clientId);

    List<ClientEntity> getClientEntitiesBy();

    @Transactional
    void deleteClientEntityByClientId(String clientId);

}
