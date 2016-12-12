package org.savant.SpringMVCSavantWeb.dao;

import java.util.List;

import org.savant.SpringMVCSavantWeb.model.CartInfo;
import org.savant.SpringMVCSavantWeb.model.OrderDetailInfo;
import org.savant.SpringMVCSavantWeb.model.OrderInfo;
import org.savant.SpringMVCSavantWeb.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
