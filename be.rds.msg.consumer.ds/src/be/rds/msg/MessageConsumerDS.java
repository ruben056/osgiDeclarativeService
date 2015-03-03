package be.rds.msg;

import be.rds.msg.IMessageProvider;

public class MessageConsumerDS {

	private IMessageProvider msgProvider;
	
	public void setMsgProvider(IMessageProvider msgProvider){
		System.out.println("Service was set. Thank you DS!");
		this.msgProvider = msgProvider;
		System.out.println(msgProvider.getMsg());
	}
	
	public void unSetMsgProvider(){
		this.msgProvider = null;
	}
}
