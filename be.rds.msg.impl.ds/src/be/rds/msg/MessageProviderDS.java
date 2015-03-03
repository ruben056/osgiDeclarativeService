package be.rds.msg;

import be.rds.msg.IMessageProvider;

public class MessageProviderDS implements IMessageProvider {

	@Override
	public String getMsg() {
		return "Msg from declarative service jeeej";
	}

}
