package com.exp.data;

import java.util.List;

import lombok.Data;

@Data
public class MessageAndLinksBasedAction extends MessageTypeAction {
	
	private List<Link> links;

}
