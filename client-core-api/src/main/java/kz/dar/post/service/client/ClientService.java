package kz.dar.post.service.client;

import kz.dar.post.ClientModel.ClientRequest;
import kz.dar.post.ClientModel.ClientResponse;

import java.util.List;

public interface ClientService {
    ClientResponse createClient(ClientRequest clientRequest);

    ClientResponse updateClient(ClientRequest clientRequest);

    ClientResponse getClientById(String clientID);

    List<ClientResponse> getAllClients();

    void deleteClientById(String clientID);
}
