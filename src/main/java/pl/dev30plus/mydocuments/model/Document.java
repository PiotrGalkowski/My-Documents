package pl.dev30plus.mydocuments.model;

import lombok.Data;

@Data
public class Document {

    private String name;
    private Type type;
    private String location;
}
