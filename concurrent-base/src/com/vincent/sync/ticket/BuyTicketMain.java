package com.vincent.sync.ticket;

/**
 * ����
 * @ClassName: BuyTicketMain
 * @Description: ����
 * @author: VincentHo
 * @date: 2019��3��30�� ����12:41:30
 */
public class BuyTicketMain {

	public static void main(String[] args) {
		int ticket = 5;
		TicketManager ticketManager = new TicketManager(ticket);
		for(int n = 0; n < ticket; n++) {
			new BuyTicketClient(ticketManager).start();
		}
	}
	
}
