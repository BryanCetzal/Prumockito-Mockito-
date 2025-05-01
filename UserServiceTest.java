import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    void testFindUserById() {
        User mockUser = new User(1, "Bryan");
        when(userRepository.findById(1)).thenReturn(mockUser);

        User result = userService.getUserById(1);

        assertNotNull(result);
        assertEquals("Bryan", result.getName());
    }
}