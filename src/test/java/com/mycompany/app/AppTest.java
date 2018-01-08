package com.mycompany.app;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

/**
 * Unit test for simple App.
 */
public class AppTest  {
    @Test
    public void testNotEquals(){ // проверка на несоответствие
        int[] verifiable = new int[]{5,4,3,2,1};
        int[] expected = new int[]{1,2,3,4,5};
        assertThat(verifiable,not(equalTo(expected)));
    }
@Test //проверка на сортировку
   public void testNewsort(){
    int[] verifiable = MyClass.mysort(new int[]{5,4,3,2,1});
    int[] expected = new int[]{1,2,3,4,5};
    assertThat(verifiable,is(expected));
    System.out.println(Arrays.toString(verifiable));
   }

   @Test(expected = IOException.class) // проаерка на исключение
    public void testException() throws IOException{
       MyClass mock = mock(MyClass.class);
       MyClass m = new MyClass(mock);
       m.mysort();
       doThrow(new IOException()).when(mock).mysort();
   }

@Test // проверка на гран. условия(?)
public void testArrayIndexOutOfBounException(){
    int[] expected = new int[]{1,2,3,4,5};
    assertThat(expected.length,equalTo(5));
}
}