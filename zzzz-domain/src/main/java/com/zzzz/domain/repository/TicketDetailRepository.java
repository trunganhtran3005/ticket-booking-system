package com.zzzz.domain.repository;

import com.zzzz.domain.model.entity.TicketDetail;

import java.util.Optional;

public interface TicketDetailRepository {
    Optional<TicketDetail> findById(Long id);
}
