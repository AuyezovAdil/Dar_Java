//package kz.dar.post.controller.deprecated;
//
//import jakarta.validation.Valid;
//import kz.dar.post.ClientModel.ClientModel;
//import kz.dar.post.feign.ClientFeign;
//import kz.dar.post.service.deprecated.ClientServiceOld;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/deprecated/client")
//
//public class ClientControllerOld {
//    @Autowired
//    private ClientServiceOld clientService;
//
//    @Autowired
//    ClientFeign clientFeign;
//
//    @GetMapping("/check")
//    public String check() {
//        return "client-core-api is working";
//    }
//    @GetMapping ("/post/check")
//    public String checkPost() {
//        return clientFeign.checkPost();
//    }
//
//    @PostMapping
//    public ResponseEntity<String> createClient(@Valid @RequestBody ClientModel clientModel) {
//        clientService.createClient(clientModel);
//        return new ResponseEntity<String>("Client created", HttpStatus.OK);
//    }
//
//    @GetMapping("/all")
//    public List<ClientModel> getClients() {
//        return clientService.getClients();
//    }
//
//    @GetMapping("/{clientId}")
//    public ClientModel getClientById(@PathVariable String clientId) {
//        return clientService.getClientById(clientId);
//    }
//
//    @PutMapping("/{clientId}")
//    public ResponseEntity<String> updateClientById(@PathVariable String clientId,
//                                               @Valid @RequestBody ClientModel clientModel) {
//        clientService.updateClientById(clientId, clientModel);
//        return new ResponseEntity<>("Client updated", HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{clientId}")
//    public ResponseEntity<String> deleteClientById(@PathVariable String clientId) {
//        clientService.deleteClientById(clientId);
//        return new ResponseEntity<>("Client deleted", HttpStatus.OK);
//    }
//
//}
