package com.zzzz.application.service.ticket.imp;

import com.zzzz.application.service.ticket.TicketDetailService;
import com.zzzz.application.service.ticket.cache.TicketDetailCacheService;
import com.zzzz.domain.model.entity.TicketDetail;
import com.zzzz.domain.service.TicketDetailDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketDetailAppServiceImp implements TicketDetailService {

    @Autowired
    TicketDetailCacheService ticketDetailCacheService;

    @Autowired
    TicketDetailDomainService ticketDetailDomainService;


    @Override
    public TicketDetail getTicketDetail(Long ticketId) {
        return ticketDetailDomainService.getTicketDetail(ticketId);
    }
}
