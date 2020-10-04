package componente.com.condominio.back;

import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.condominio.backend.Application;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@DirtiesContext
@ActiveProfiles("TEST")
@Tag("Componente")
public abstract class ApplicationComponenteTest {


}

