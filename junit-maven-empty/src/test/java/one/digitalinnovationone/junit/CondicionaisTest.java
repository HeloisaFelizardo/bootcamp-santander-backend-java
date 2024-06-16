package one.digitalinnovationone.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "USER" , matches = "root")
    void validarAlgoSomenteNoUsusarioHeloisa(){
        Assertions.assertEquals(10, 5 + 5);
    }


    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoSomenteNoUsusarioHeloisa2(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JAVA_8)
    void validarAlgoSomenteNoUsusarioHeloisa3(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsusarioHeloisa4(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
