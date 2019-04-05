package com.vincent.sync.ticket;

/**
 * 票务处类
 * @ClassName: TicketManager
 * @Description: 票务处类
 * @author: VincentHo
 * @date: 2019年3月30日 下午12:38:36
 */
public class TicketManager {

	/** 票余数 */
	private int ticketNum;
	
	/**
	 * 购票方法
	 * @Title:TicketManager
	 * @Description:购票方法
	 * @author VincentHo
	 * @date 2019年3月30日
	 * @param clientName
	 */
	public void buyTicket(String clientName) {
	    //增加synchronized锁
	    synchronized (this) {
            this.ticketNum--;
            System.out.println(clientName + "得到票，余票：" + (--this.ticketNum));
        }
	}
	
	public TicketManager(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	
}
