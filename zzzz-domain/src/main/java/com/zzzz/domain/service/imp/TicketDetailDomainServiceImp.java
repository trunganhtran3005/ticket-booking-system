package com.zzzz.domain.service.imp;

import com.zzzz.domain.model.entity.TicketDetail;
import com.zzzz.domain.repository.TicketDetailRepository;
import com.zzzz.domain.service.TicketDetailDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketDetailDomainServiceImp implements TicketDetailDomainService {

    @Autowired
    TicketDetailRepository ticketDetailRepository;


    @Override
    public TicketDetail getTicketDetail(Long ticketId) {
        return ticketDetailRepository.findById(ticketId).orElse(null);
    }
}
