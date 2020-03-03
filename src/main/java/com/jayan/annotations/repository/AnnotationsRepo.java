package com.jayan.annotations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnotationsRepo extends JpaRepository<String, String> {

}
