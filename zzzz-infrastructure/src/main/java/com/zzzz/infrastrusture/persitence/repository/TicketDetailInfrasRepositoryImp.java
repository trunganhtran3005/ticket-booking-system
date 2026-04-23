package com.zzzz.infrastrusture.persitence.repository;

import com.zzzz.domain.model.entity.TicketDetail;
import com.zzzz.domain.repository.TicketDetailRepository;
import com.zzzz.infrastrusture.persitence.mapper.TicketDetailJPAMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketDetailInfrasRepositoryImp implements TicketDetailRepository {

    @Autowired
    TicketDetailJPAMapper ticketDetailJPAMapper;

    @Override
    public Optional<TicketDetail> findById(Long id) {
        return ticketDetailJPAMapper.findById(id);
    }
}
