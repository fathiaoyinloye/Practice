package tests;

import Revisions.Admin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAdminSingleton {
  
    @Test
    public void testThatanObjectOfAdminCanBeGotten_ageIsSet(){
       Admin admin1  = Admin.getOnlyInstance();
       assertNotNull(admin1);
       admin1.setAge(12);
       assertEquals(12, admin1.getAge());
    }
    @Test
    public void createAdmin1Object_age12IsSet_createAdmin2Object_getAge12(){
        Admin admin1  = Admin.getOnlyInstance();
        assertNotNull(admin1);
        admin1.setAge(12);
        assertEquals(12, admin1.getAge());
        Admin admin2  = Admin.getOnlyInstance();
        assertEquals(12, admin1.getAge());


    }
}

