package com.envers.demo.repositories;

import com.envers.demo.models.Test;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITestRepository extends JpaRepository<Test,Long> {
}
