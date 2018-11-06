package inegrationstest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegnemaskineTest {


    @Test
    void testRegnemaskine(){  // integration test

        // Arrange
        Regnemaskine regnemaskine = new Regnemaskine(new Sum());

        // Assert

        assertEquals(3, regnemaskine.add(1,4));


    }

    @Test
    void testRegnemaskineWithStub(){   // unit test Regnemaskine test med stub

        // Arrange
        Regnemaskine regnemaskine = new Regnemaskine(new Sum_Stub());

        // Assert

        assertEquals(3, regnemaskine.add(1,4));


    }

    @Test
    void testSum(){   // unit test Sum class.

        // Arrange

        Sum sumObject = new Sum();

        // Act

        int sumInt = sumObject.laegSammen(10,20);

        // Assert

        assertEquals(30, sumInt);



    }

}