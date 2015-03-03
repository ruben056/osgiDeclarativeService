package be.rds.msg;

import be.rds.msg.IMessageProvider;

public class MessageProvider implements IMessageProvider {

	@Override
	public String getMsg() {
		return "This is a msg from an osgi service";
	}

}
