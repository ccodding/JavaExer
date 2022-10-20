package D_1020;

import java.util.ArrayList;
import java.util.List;

public class Stack02 {

    private Integer[] arr; // 다형성 적용 고려
    private int top = 0;
    public Stack02(){
        this.arr = new Integer[10000];
    }

    public Stack02(int size){
        this.arr = new Integer[size];
    }

    public Integer[] getArr(){ // getter
        return arr;
    }

    public void push(int value){
        this.arr[top] = value;
        this.top ++;
    }

    public int pop(){
        int value = this.arr[this.top-1];
        this.top--;
        return value;
    }

}
