
import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.Assertions;


class PickMathOperationTest {

    @Test
    void num1PlusNum2EqualNum3() {

       PickMathOperation pick= new PickMathOperation();
       
        Assertions.assertEquals("+", pick.pickIt(2,5,7));


    }

 
}