package com.example.nguyenduccanh.repository;

import com.example.nguyenduccanh.model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}

