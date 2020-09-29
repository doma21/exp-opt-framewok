package com.exp.data;

import lombok.Data;

/**
 * @author pdoma
 * 
 * This holds the sate of the user and data, for now it will have below 4 properties.
 *
 */
@Data
public class State {
	
	private boolean prospect;
	private boolean blocked;
	private String orderType;
	private String page;
	private String exceptionType;


}
