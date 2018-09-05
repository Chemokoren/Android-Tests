package com.kibet.order.bo;

import com.kibet.order.bo.exception.BOException;
import com.kibet.order.dto.Order;

public interface OrderBO {
	 boolean placeOrder(Order order) throws BOException;
	 boolean cancelOrder(int id) throws BOException;
	 boolean deleteOrder(int id) throws BOException;

}
