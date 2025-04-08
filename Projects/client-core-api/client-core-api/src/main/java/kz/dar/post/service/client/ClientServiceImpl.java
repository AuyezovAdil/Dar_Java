package kz.dar.post.service.client;

import kz.dar.post.ClientModel.ClientRequest;
import kz.dar.post.ClientModel.ClientResponse;
import kz.dar.post.repository.ClientEntity;
import kz.dar.post.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service

public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    private static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Override
    public ClientResponse createClient(ClientRequest clientRequest) {
        clientRequest.setClientId(UUID.randomUUID().toString());
        ClientEntity clientEntity = modelMapper.map(clientRequest, ClientEntity.class);
        clientRepository.save(clientEntity);
        return modelMapper.map(clientEntity, ClientResponse.class);
    }

    @Override
    public ClientResponse updateClient(ClientRequest clientRequest) {
        ClientEntity clientEntity = modelMapper.map(clientRequest, ClientEntity.class);
        ClientEntity dbEntity = clientRepository.getClientEntityByClientId(clientRequest.getClientId());
        clientEntity.setId(dbEntity.getId());
        clientRepository.save(clientEntity);
        return modelMapper.map(clientEntity, ClientResponse.class);
    }

    @Override
    public ClientResponse getClientById(String clientID) {
        ClientEntity clientEntity = clientRepository.getClientEntityByClientId(clientID);
        return modelMapper.map(clientEntity, ClientResponse.class);
    }

    @Override
    public List<ClientResponse> getAllClients() {
        return clientRepository.getClientEntitiesBy().stream().map(client -> modelMapper.map(client, ClientResponse.class)).
                collect(Collectors.toList());
    }

    @Override
    public void deleteClientById(String clientID) {
        clientRepository.deleteClientEntityByClientId(clientID);

    }
}
