package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackXTest {

    /**
     * проверка вставки
     */
    @Test
    public void testPush() {
        StackX theStack = new StackX(10);       // создание объекта
        theStack.push(5);                       // вставка элементов в стек
        theStack.push(7);
        assertEquals(7,theStack.peek());   // проверка ожидаемого и возвращаемого значения

    }//end testPush()

    /**
     * проверка удаления из стека
     */
    @Test
    public void testPop() {
        StackX theStack = new StackX(10);
        theStack.push(5);
        theStack.push(6);
        assertEquals(6,theStack.pop());
    }//end testPop()

    /**
     * проверка считываиня верхнего значения стека
     */
    @Test
    public void testPeek() {
        StackX theStack = new StackX(10);
        theStack.push(5);
        theStack.push(6);
        assertEquals(6,theStack.peek());

    }//end testPeek()

    /**
     * проверка на пустоту
     */
    @Test
    public void testIsEmpty() {
        StackX theStack = new StackX(10);
        theStack.push(5);
        theStack.pop();
        assertEquals(true,theStack.isEmpty());
    }//end testIsEmpty()

    /**
     * проверка на заполненность стека
     */
    @Test
    public void testIsFull() {
        StackX theStack = new StackX(2);
        theStack.push(5);
        theStack.push(5);
        assertEquals(true,theStack.isFull());
    }//end testIsFull()

}