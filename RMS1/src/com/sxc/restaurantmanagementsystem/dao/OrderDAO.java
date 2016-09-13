/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Order;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface OrderDAO {
    public int add(Order order)throws SQLException;
    public Boolean edit(Order order);
    public int delete(Order order) throws SQLException;
    public List<Order> getAll()throws SQLException;
    public Order getById(int id)throws SQLException;
    public List<Order> search(String parameter)throws SQLException;
    
}
