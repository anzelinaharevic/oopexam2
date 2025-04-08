import java.util.Scanner;

public class address {
    Scanner address;
    @BeforeEach
    void Setup(){
        address = new address ("testing address");
    }
    @Test
    void ScannertestIsOpen(){
        assertNotEquals(9,12);
        assertNotEquals(41,12);
        assertArrayEquals (
                address[]{1,2,3,4,5,6,7,8,9,10,11,12}),"address testing done");
    }
}
