package com.example.shose.server.repository;

import com.example.shose.server.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nguyễn Vinh
 */
@Repository
public interface BillRepository extends JpaRepository<Bill,String> {
}
