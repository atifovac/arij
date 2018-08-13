package com.arij.core.implementations;

import com.arij.core.entities.Issue;
import com.arij.core.services.TicketService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest {

    @Mock
    private TicketService ticketService;

    /*
     * mandatory for JUnit
     */
    public TicketServiceTest() {
    }

    @Test
    public void whenInitialStatusThenTicketListIsEmpty() {
        assertAll("ticket list test",
                () -> assertEquals(0, ticketService.getTicketList().size())
        );
    }

    @Test
    @Disabled("manca il mock dei metodi chiamati da ticketService.newTicket()")
    @Ignore
    public void givenTicketListEmptyWhenNewTicketThenTicketListSizeIsOne() {

        assertEquals(0, ticketService.getTicketList().size());
        assertAll("add new element to ticket list test",
                () -> assertEquals(0, ticketService.newTicket(new Issue(0, "test"), 0, new ArrayList<>())),
                () -> assertEquals(1, ticketService.getTicketList().size())
        );
    }

}
