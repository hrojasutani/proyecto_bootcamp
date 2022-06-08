package com.nttdata.proyectobootcampjpa.service;

import com.nttdata.proyectobootcampjpa.model.jpa.Client;
import com.nttdata.proyectobootcampjpa.model.request.ClientRequest;
import com.nttdata.proyectobootcampjpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client save(ClientRequest request) {
        Client client = new Client();
        client.setName(request.getName());
        client.setLastname(request.getLastname());
        client.setEmail(request.getEmail());
        client.setPhone(request.getPhone());
        client.setStatus(request.isStatus());
        return clientRepository.save(client);
    }

    public List<Client> list() {
        return clientRepository.findAll();
    }

    public Client update(ClientRequest request){
        Client client = new Client();
        client.setId(request.getId());
        client.setName(request.getName());
        client.setLastname(request.getLastname());
        client.setEmail(request.getEmail());
        client.setPhone(request.getPhone());
        client.setStatus(request.isStatus());
        return clientRepository.save(client);
    }

    public boolean delete(int id){
        clientRepository.deleteById(id);
        return true;
    }
}
