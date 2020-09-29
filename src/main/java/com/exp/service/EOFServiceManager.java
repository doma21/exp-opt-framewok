package com.exp.service;

import org.springframework.stereotype.Service;

import com.exp.data.ActionType;
import com.exp.data.MessageTypeAction;
import com.exp.data.NextBestAction;
import com.exp.data.State;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * @author pdoma
 *
 */
@Service
@Slf4j
public class EOFServiceManager {
	
	/**
	 * This method returns possible next best action based on the state and desired action type.
	 * @param state
	 * @param actionType
	 * @return
	 */
	public Mono<? extends NextBestAction> getNextBestAction( State state, ActionType actionType ){
		
		log.info("State {0} and ActionType is {1}",state, actionType);
		
		MessageTypeAction messageTypeAction = new MessageTypeAction();
		messageTypeAction.setMessageCode("");
		messageTypeAction.setMessage("");
		
		return Mono.just(messageTypeAction);
	}

}
