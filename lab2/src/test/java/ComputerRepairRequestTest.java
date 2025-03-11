import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test Default Constructor")
    public void testDefaultConstructor() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals(0, computerRepairRequest.getID());
        assertEquals("", computerRepairRequest.getOwnerName());
        assertEquals("",computerRepairRequest.getOwnerAddress());
        assertEquals("", computerRepairRequest.getPhoneNumber());
        assertEquals("", computerRepairRequest.getModel());
        assertEquals("", computerRepairRequest.getDate());
        assertEquals("", computerRepairRequest.getProblemDescription());
    }

    @Test
    @DisplayName("Test Constructor")
    public void testConstructor() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(
                1,
                "alex",
                "1st Street",
                "0123456789",
                "model",
                "1-1-2000",
                "test desc"
        );
        assertEquals(1, computerRepairRequest.getID());
        assertEquals("alex", computerRepairRequest.getOwnerName());
        assertEquals("1st Street",computerRepairRequest.getOwnerAddress());
        assertEquals("0123456789", computerRepairRequest.getPhoneNumber());
        assertEquals("model", computerRepairRequest.getModel());
        assertEquals("1-1-2000", computerRepairRequest.getDate());
        assertEquals("test desc", computerRepairRequest.getProblemDescription());

    }

      
}
