package pl.dev30plus.mydocuments.service;

import pl.dev30plus.mydocuments.model.Document;
import pl.dev30plus.mydocuments.model.Type;

import java.util.List;

public interface SearchEngine {
    List<Document> findByType(Type documentType);
    List<Document> listAll();
}
