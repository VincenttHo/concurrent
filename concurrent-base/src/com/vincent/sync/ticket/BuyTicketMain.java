package com.vincent.sync.ticket;

/**
 * 主类
 * @ClassName: BuyTicketMain
 * @Description: 主类
 * @author: VincentHo
 * @date: 2019年3月30日 下午12:41:30
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
