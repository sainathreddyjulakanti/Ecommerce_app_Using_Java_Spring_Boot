package com.ecommerce.project.ExceptionHandler;

public class ResponseNotFoundException extends RuntimeException{
    String resourceName;
    String field;
    String fieldName;
    Long filedId;

    public ResponseNotFoundException() {
    }

    public ResponseNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("%s not found found with %s:%s",resourceName,field,fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResponseNotFoundException(String resourceName, String field,  Long filedId) {
        super(String.format("%s not found found with %s:%s",resourceName,field,filedId));
        this.resourceName = resourceName;
        this.field = field;
        this.filedId = filedId;
    }
}
