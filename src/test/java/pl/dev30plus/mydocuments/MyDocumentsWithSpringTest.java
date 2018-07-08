package pl.dev30plus.mydocuments;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dev30plus.mydocuments.model.Document;
import pl.dev30plus.mydocuments.model.Type;
import pl.dev30plus.mydocuments.service.SearchEngine;

import java.util.List;

import static org.junit.Assert.*;

public class MyDocumentsWithSpringTest {

    private ClassPathXmlApplicationContext context;
    private SearchEngine engine;
    private Type documentType;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("META-INF/spring/mydocuments-context.xml");
        engine = context.getBean(SearchEngine.class);
        documentType = context.getBean(Type.class);
    }

    @Test
    public void testWithSpringFindByType() {
        List<Document> documents = engine.findByType(documentType);

        assertNotNull(documents);
        assertTrue(documents.size() == 1);
        assertEquals(documentType.getName(), documents.get(0).getType().getName());
        assertEquals(documentType.getDescription(), documents.get(0).getType().getDescription());
        assertEquals(documentType.getExtension(), documents.get(0).getType().getExtension());

    }

    @Test
    public void testListAll() {
        List<Document> documents = engine.listAll();

        assertNotNull(documents);
        assertTrue(documents.size() == 1);
    }
}
