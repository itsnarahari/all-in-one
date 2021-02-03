package com.allinone.dao;

import com.allinone.model.Developers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevelopersRepository extends JpaRepository<Developers,Integer> {
}
