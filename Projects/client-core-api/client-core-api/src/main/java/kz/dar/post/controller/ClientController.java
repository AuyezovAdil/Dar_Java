package kz.dar.post.controller;

import kz.dar.post.ClientModel.ClientRequest;
import kz.dar.post.ClientModel.ClientResponse;
import kz.dar.post.service.deprecated.ClientServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientServiceOld clientService;

    @PostMapping
    public ClientResponse createClient(@RequestBody ClientRequest clientRequest) {
//        return clientService.createClient(clientRequest);
        return null;
    }

    @PutMapping
    public ClientResponse updateClient(@RequestParam String clientId, @RequestBody ClientRequest clientRequest) {
        clientRequest.setClientId(clientId);
//        return clientService.updateClientById(clientRequest);
        return null;
    }
    @GetMapping
    public ClientResponse getClientById(@RequestParam String clientId) {
//        return clientService.getClientById(clientId);
        return null;
    }
    @GetMapping("/all")
    public List<ClientResponse> getAllClients() {
//        return clientService.getAllClients;
        return null;
    }
    @DeleteMapping
    public void deleteClientById(@RequestParam String clientId) {
        clientService.deleteClientById(clientId);

    }

}
