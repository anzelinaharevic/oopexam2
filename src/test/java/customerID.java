import java.util.Scanner;

public class customerID {
    Scanner customerID;
    @BeforeEach
    void Setup(){
        customerID = new customerID ("testing customerID");
    }
    @Test
    void ScannertestIsOpen(){
        assertNotEquals(7,8);
        assertNotEquals(13,8);
        assertArrayEquals (
                customerID[]{1,2,3,4,5,6,7,8}),"customer id testing done");
    }
}
