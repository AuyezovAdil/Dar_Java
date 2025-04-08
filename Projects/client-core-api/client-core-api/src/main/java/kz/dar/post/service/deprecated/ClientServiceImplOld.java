package kz.dar.post.service.deprecated;

import kz.dar.post.ClientModel.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
@Service

public class ClientServiceImplOld implements ClientServiceOld {

    private static final HashMap<String, ClientModel> clientMap = new HashMap<String, ClientModel>();

    static {
        ClientModel clientModel1 = new ClientModel(UUID.randomUUID().toString(),
                "Adil", "Adilov", "adil@mail.ru");
        ClientModel clientModel2 = new ClientModel(UUID.randomUUID().toString(),
                "Abay", "Abaev", "abay@mail.ru");
        ClientModel clientModel3 = new ClientModel(UUID.randomUUID().toString(),
                "Esen", "Khasenov", "esen@mail.ru");
        clientMap.put(clientModel1.getClientId(), clientModel1);
        clientMap.put(clientModel2.getClientId(), clientModel2);
        clientMap.put(clientModel3.getClientId(), clientModel3);
    }
    @Override
    public void createClient(ClientModel clientModel) {
        clientModel.setClientId(UUID.randomUUID().toString());
        clientMap.put(clientModel.getClientId(), clientModel);
    }

    @Override
    public List<ClientModel> getClients() {
        return new ArrayList<ClientModel>(clientMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return clientMap.get(clientId);
    }

    @Override
    public void updateClientById(String clientId, ClientModel clientModel) {
        clientModel.setClientId(clientId);
        clientMap.put(clientId, clientModel);
    }

    @Override
    public void deleteClientById(String clientId) {
        clientMap.remove(clientId);

    }
}
