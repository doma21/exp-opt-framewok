package com.exp.data;

import lombok.Data;

@Data
public class MessageTypeAction extends NextBestAction {
	
	private String messageCode;
	private String message;

}
