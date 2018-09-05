package com.kibet.order.bo;

import java.sql.SQLException;

import com.kibet.order.bo.exception.BOException;
import com.kibet.order.dao.OrderDAO;
import com.kibet.order.dto.Order;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);

		}
		return true;
	}

	public boolean cancelOrder(int id) throws BOException {
		try {
			Order order_read = dao.read(id);
			order_read.setStatus("Cancelled");
			int my_update = dao.update(order_read);
			if(my_update ==0){
				return false;
			}
			
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	public boolean deleteOrder(int id) throws BOException {
		try {
			int my_delete = dao.delete(id);
			if(my_delete ==0){
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
