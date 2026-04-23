package com.zzzz.Controller.Resource;

import com.zzzz.Controller.Model.enums.ResultUtil;
import com.zzzz.Controller.Model.vo.ResultMessage;
import com.zzzz.application.service.ticket.TicketDetailService;
import com.zzzz.domain.model.entity.TicketDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
@Slf4j
public class TicketDetailController {

    @Autowired
    private TicketDetailService ticketDetailService;

    @GetMapping("/{ticketId}/detail/{detailId}")
    public ResultMessage<TicketDetail> getTicketDetail(
            @PathVariable("ticketId") Long ticketId,
            @PathVariable("detailId") Long detailId
    ) {
        return ResultUtil.data(ticketDetailService.getTicketDetail(ticketId));
    }
}
