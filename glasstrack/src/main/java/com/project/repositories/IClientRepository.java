package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

}
