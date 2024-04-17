package com.example.read.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "books")
@Entity(name = "books")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private String link;
    private Integer position;

    public Book(BookRequestDTO data){
        this.position = data.position();
        this.link = data.link();
        this.image = data.image();
        this.title = data.title();
    }
}
