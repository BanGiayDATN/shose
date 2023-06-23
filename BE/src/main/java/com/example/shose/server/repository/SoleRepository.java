package com.example.shose.server.repository;

import com.example.shose.server.entity.Sole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nguyễn Vinh
 */
@Repository
public interface SoleRepository extends JpaRepository<Sole,String> {
}
