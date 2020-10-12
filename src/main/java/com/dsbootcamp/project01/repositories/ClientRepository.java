package com.dsbootcamp.project01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsbootcamp.project01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
