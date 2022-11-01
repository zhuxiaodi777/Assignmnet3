/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.user;

import java.util.ArrayList;

/**
 *
 * @author judy
 */
public class MasterOrderList {
    
    ArrayList<Order> orderList;
    
    public MasterOrderList(){
        orderList= new ArrayList<Order>();
        
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addNewOrder(Order order){
        this.orderList.add(order);
    }
}
