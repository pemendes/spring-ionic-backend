package com.cvmendes.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvmendes.cursospring.domain.Client;
import com.cvmendes.cursospring.repositories.ClientRepository;
import com.cvmendes.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public Client find(Integer id) {
		Optional<Client> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objet non trouvé! Id: " + id + ", Type: " + Client.class.getName())); 
	} 
}
