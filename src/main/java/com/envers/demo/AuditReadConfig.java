package com.envers.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditReadConfig {
    private final EntityManagerFactory entityManagerFactory;

    public AuditReadConfig(EntityManagerFactory entityManager) {
        this.entityManagerFactory= entityManager;
    }


    @Bean
    public AuditReader auditReader(){
        return AuditReaderFactory.get(this.entityManagerFactory.createEntityManager());
    }
}
