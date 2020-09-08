package com.tinet.clink.openapi.response.ticket;

import com.tinet.clink.openapi.model.TicketDeatilModel;
import com.tinet.clink.openapi.response.PagedResponse;

/**
 * @author liuhy
 * @date: 2020/9/8
 **/
public class GetTicketDetailResponse extends PagedResponse {


    private TicketDeatilModel ticketDetail;

    public TicketDeatilModel getTicketDetail() {
        return ticketDetail;
    }

    public void setTicketDetail(TicketDeatilModel ticketDetail) {
        this.ticketDetail = ticketDetail;
    }
}