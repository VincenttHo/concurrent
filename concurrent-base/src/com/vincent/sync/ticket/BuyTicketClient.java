package com.vincent.sync.ticket;

/**
 * ��Ʊ�ͻ�
 * @ClassName: BuyTicketClient
 * @Description: ��Ʊ�ͻ�
 * @author: VincentHo
 * @date: 2019��3��30�� ����12:39:40
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
