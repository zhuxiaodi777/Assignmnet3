/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.user;

import java.util.ArrayList;
import java.util.List;
import model.DoctorProfile;


/**
 *
 * @author judy
 */
public class Order {
    
    List<OrderItem> orderItemlist;
    
    public Order() {
        this.orderItemlist = new ArrayList<OrderItem>();
        
    }

    public List<OrderItem> getOrderItemlist() {
        return orderItemlist;
    }

    public void setOrderItemlist(List<OrderItem> orderItemlist) {
        this.orderItemlist = orderItemlist;
    }
    
    public void addNewOrderItem(DoctorProfile doctorProfile,String recordDate ){
        
        OrderItem orderItem = new OrderItem(doctorProfile,recordDate);
        orderItemlist.add(orderItem);
        
    }
    public void deleteItem(OrderItem item){
        this.orderItemlist.remove(item);
    }
    
    public OrderItem findDoctor(DoctorProfile doctorProfile){
        for (OrderItem oi : this.getOrderItemlist()){
            if (oi.getDoctorProfile().equals(doctorProfile)){
                return oi;
            }
        }
        return null;
    }
    
}
