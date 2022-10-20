package test;

import D_1020.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        //ex) db에서 데이터 지우는 코드
        //ex) db에 데이터를 넣는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push check")
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }
}

