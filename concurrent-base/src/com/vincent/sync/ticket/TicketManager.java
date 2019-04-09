package com.vincent.sync.ticket;

/**
 * Ʊ����
 * @ClassName: TicketManager
 * @Description: Ʊ����
 * @author: VincentHo
 * @date: 2019��3��30�� ����12:38:36
 */
public class TicketManager {

	/** Ʊ���� */
	private int ticketNum;
	
	/**
	 * ��Ʊ����
	 * @Title:TicketManager
	 * @Description:��Ʊ����
	 * @author VincentHo
	 * @date 2019��3��30��
	 * @param clientName
	 */
	public void buyTicket(String clientName) {
	    //����synchronized��
	    synchronized (this) {
            this.ticketNum--;
            System.out.println(clientName + "�õ�Ʊ����Ʊ��" + (--this.ticketNum));
        }
	}
	
	public TicketManager(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	
}
