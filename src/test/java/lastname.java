import java.util.Scanner;

public class lastname {
    Scanner lastname;
    @BeforeEach
    void Setup(){
        lastname = new lastname ("testing lastname");
    }
    @Test
    void ScannertestIsOpen(){
        assertArrayEquals (
                lastname[]{1,2,3}),"lastname array testing done");
    }
}
