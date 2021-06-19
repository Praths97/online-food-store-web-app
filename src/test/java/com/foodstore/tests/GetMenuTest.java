package com.foodstore.tests;

import com.foodstore.model.MenuItem;
import com.foodstore.services.menuitems.MenuItemServiceImplementation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetMenuTest {
    @Test
    public void checkMenu(){
        MenuItemServiceImplementation menuItemServiceImplementation=new MenuItemServiceImplementation();
    MenuItem menuItem  = menuItemServiceImplementation.getMenu("111");
        assertEquals("PIZZA",menuItem.getName());
    }
}
