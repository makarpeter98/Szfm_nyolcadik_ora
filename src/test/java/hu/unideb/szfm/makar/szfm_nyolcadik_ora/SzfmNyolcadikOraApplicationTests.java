package hu.unideb.szfm.makar.szfm_nyolcadik_ora;

import hu.unideb.szfm.makar.szfm_nyolcadik_ora.controller.MainController;
import hu.unideb.szfm.makar.szfm_nyolcadik_ora.model.Person;
import hu.unideb.szfm.makar.szfm_nyolcadik_ora.model.PersonRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class SzfmNyolcadikOraApplicationTests {

	/*@Mock
	private PersonRepository personRepository;
	@Mock
	private Model model;
	@InjectMocks
	private MainController mainController;
	@Test
	void listAllPersonsShouldAddPersonsToModelAndReturnView() {
		List<Person> persons = List.of(
				Person.builder()
						.firstName("Elek")
						.lastName("Teszt")
						.email("teszt.elek@email.com")
						.enabled(true)
						.build()
		);
		when(personRepository.findAll()).thenReturn(persons);
		String viewName = mainController.listAllPersons(model);
		assertEquals("persons", viewName);
		verify(personRepository).findAll();
		verify(model).addAttribute("personsList", persons);
	}*/
}
