package com.example.demo._user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class UserRepogitory {
    private final EntityManager entityManager;

    public void findAll() {
        return;
    }

    public void findById() {
        return;
    }

    @Transactional
    public void save() {
        return;
    }

    @Transactional
    public void upDate() {
        return;
    }

    @Transactional
    public void delete() {
        return;
    }
}
