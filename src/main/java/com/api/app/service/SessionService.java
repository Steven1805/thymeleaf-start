package com.api.app.service;

import com.api.app.model.Session;
import com.api.app.repository.SessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SessionService {
    private final SessionRepository repository;

    public List<Session> getSession() {
        return repository.findAll();
    }

    public Session save(Session session) {
        return repository.save(session);
    }

    public Session getSessionById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteSession(String id) {
        System.out.println(id);
        repository.deleteById(id);
    }
}
