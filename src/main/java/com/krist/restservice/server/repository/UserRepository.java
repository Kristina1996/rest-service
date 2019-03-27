
package com.krist.restservice.server.repository;

import com.krist.restservice.server.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author krist
 */
public interface UserRepository extends JpaRepository<Client, Integer> {
    
}
