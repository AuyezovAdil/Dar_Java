package kz.dar.post.service.deprecated;

import kz.dar.post.ClientModel.ClientModel;

import java.util.List;

public interface ClientServiceOld {
    void createClient(ClientModel clientModel);
    List<ClientModel> getClients();
    ClientModel getClientById(String clientId);
    void updateClientById(String clientId, ClientModel clientModel);
    void deleteClientById(String clientId);
}
