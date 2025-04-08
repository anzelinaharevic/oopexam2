import java.util.Scanner;

public class firstname {
    Scanner firstname;
    @BeforeEach
    void Setup(){
        firstname = new firstname ("testing firstname");
    }
    @Test
    void ScannertestIsOpen(){
        assertArrayEquals (
                firstname[]{1,2,3}),"first name array testing done");
    }
}
