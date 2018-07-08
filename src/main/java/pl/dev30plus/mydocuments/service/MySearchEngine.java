package pl.dev30plus.mydocuments.service;

import pl.dev30plus.mydocuments.model.Document;
import pl.dev30plus.mydocuments.model.Type;

import java.util.ArrayList;
import java.util.List;

public class MySearchEngine implements SearchEngine {

    @Override
    public List<Document> findByType(Type documentType) {
        List<Document> result = new ArrayList<>();

        for (Document document : storage()) {
            if (document.getType().getName().equals(documentType.getName()))
                result.add(document);
        }
        return result;
    }

    @Override
    public List<Document> listAll() {
        return storage();
    }

    private List<Document> storage() {
        List<Document> result = new ArrayList<>();

        Type type = new Type();
        type.setName("PDF");
        type.setDescription("Portable Document Format");
        type.setExtension(".pdf");

        Document document = new Document();
        document.setName("Szablon książki");
        document.setType(type);
        document.setLocation("/Documents/Book template.pdf");

        result.add(document);

        return result;
    }
}
