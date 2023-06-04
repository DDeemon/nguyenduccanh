package com.example.nguyenduccanh.repository;

import com.example.nguyenduccanh.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}

