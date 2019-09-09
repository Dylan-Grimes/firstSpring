package com.qa.repository;

import com.qa.models.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players, Long> {

}
