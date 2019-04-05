package com.vincent.sync.ticket;

/**
 * 购票客户
 * @ClassName: BuyTicketClient
 * @Description: 购票客户
 * @author: VincentHo
 * @date: 2019年3月30日 下午12:39:40
 */
public class BuyTicketClient extends Thread {

	private TicketManager ticketManager;
	
	public BuyTicketClient(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		ticketManager.buyTicket(threadName);
	}

}
