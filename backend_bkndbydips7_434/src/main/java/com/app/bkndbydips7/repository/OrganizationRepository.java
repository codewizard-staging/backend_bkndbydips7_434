package com.app.bkndbydips7.repository;

import com.app.bkndbydips7.model.Organization;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrganizationRepository extends SimpleJpaRepository<Organization, String> {
    private final EntityManager em;
    public OrganizationRepository(EntityManager em) {
        super(Organization.class, em);
        this.em = em;
    }
    @Override
    public List<Organization> findAll() {
        return em.createNativeQuery("Select * from \"bkndbydips7\".\"Organization\"", Organization.class).getResultList();
    }
}