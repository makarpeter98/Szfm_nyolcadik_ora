/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockito_test;

import com.mycompany.l6_mockito.Person;
import com.mycompany.l6_mockito.PersonDataReader;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.BDDMockito.given;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author admin
 */
public class PersonTest {

    @Mock
    private PersonDataReader pdr;
    private Person underTest1, underTest2;

    @BeforeAll //@BeforeClass
    public static void setUpClass() {
    }

    @AfterAll //@AfterClass
    public static void tearDownClass() {
    }

    @BeforeEach //@Before
    public void setUp() {
    }

    @AfterEach //@After
    public void tearDown() {
    }

    @Test
    public void scannedPersonTest() {

    }

    @Test
    public void PersonConstructorShouldThrowExceptionForWrongID() {

    }

    @Test
    public void toStringShouldReturnString() {

    }

    @Test
    //@Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
    void test_this() throws InterruptedException {

    }

    @ParameterizedTest
    @ValueSource(chars = {'0'})
    void containsCharShouldRetrunTrueForContainedChars(char input) {

    }
}

/*
@RunWith(JUnitPlatform.class)
@SelectClasses({ DisplayExampleTest.class, DisplayGeneratorExampleTest.class })
public class TestSuiteWithSelectClass {}
*/
