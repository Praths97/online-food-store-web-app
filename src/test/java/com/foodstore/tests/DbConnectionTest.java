package com.foodstore.tests;

import com.foodstore.dbhelper.DBConnectionImplementation;
import org.junit.Test;

import static org.junit.Assert.*;

public class DbConnectionTest {
    @Test
    public void checkDb(){
        DBConnectionImplementation dbConnectionImplementation= new DBConnectionImplementation();
        assertNotNull(dbConnectionImplementation);
    }

}
