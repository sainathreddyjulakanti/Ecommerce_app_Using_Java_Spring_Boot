package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Generation type Auto,Identity,Sequence,Generated
    private Long categoryId;
    @NotBlank
    @Size(min=5,message = "Alteast 5 Characters")
    private String categoryName;

//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public Long getCategoryId() {
//        return categoryId;
//    }
//
////    public Category(Long categoryId, String categoryName) {
////        this.categoryId = categoryId;
////        this.categoryName = categoryName;
////    } The Hibernate doesnt need the arg construtor
//public Category() {
//    // no-arg constructor required by Hibernate
//}
//
//
//    public void setCategoryId(Long categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
}
