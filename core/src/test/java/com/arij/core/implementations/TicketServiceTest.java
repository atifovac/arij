package com.arij.core.implementations;

import com.arij.core.entities.Issue;
import com.arij.core.services.TicketService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest {

    @Mock
    private TicketService ticketService;

    /*
     * mandatory for JUnit
     */
    public TicketServiceTest() {}

    @Test
    public void whenInitialStatusThenTicketListIsEmpty() {
        Assert.assertEquals(0, ticketService.getTicketList().size());
    }

    @Test
    @Ignore
    //bisogna forse mockare qualche metodo
    public void givenTicketListEmptyWhenNewTicketThenTicketListSizeIsOne() {
        Assert.assertEquals(0, ticketService.getTicketList().size());
        Assert.assertEquals(0, ticketService.newTicket(new Issue(0, "test"), 0, new ArrayList<>()));
        Assert.assertEquals(1, ticketService.getTicketList().size());
    }

}
