package uge7;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    // Arrange
    final int [] array1 = {1,2,3,4,5,6,7,8,1,1,5,6};
    final int [] array2 = null;
    final int [] array3 = {};



    @org.junit.jupiter.api.Test
    void arrayToString() {

        // Arrange

        String s1, s2, s3;

        // Act
        s1 = ArrayUtil.arrayToString(array1);
        s2 = ArrayUtil.arrayToString(array2);
        s3 = ArrayUtil.arrayToString(array3);

        // Assert
        assertEquals("1 2 3 4 5 6 7 8 1 1 5 6 ", s1);
        assertEquals("", s2);
        assertEquals("", s3);


    }

    @org.junit.jupiter.api.Test
    void occurences() {

        // Arrange

        int total1, total2, total3;

        //Act

        total1 = ArrayUtil.occurences(array1, 1);
        total2 = ArrayUtil.occurences(array2, 9);
        total3 = ArrayUtil.occurences(array3, 8);

        //Assert
        assertEquals(3, total1);
        assertEquals(0, total2);
        assertEquals(0, total3);
    }

    @org.junit.jupiter.api.Test
    void sum() {

        // Arrange

        int sum1, sum2, sum3;

        // Act
        sum1 = ArrayUtil.sum(array1);
        sum2 = ArrayUtil.sum(array2);
        sum3 = ArrayUtil.sum(array3);

        // Assert
        assertEquals(49, sum1);
        assertEquals(0, sum2);
        assertEquals(0, sum3);


    }
}