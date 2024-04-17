package com.example.read.book;

public record BookResponseDTO(Long id, String title, String image, String link, Integer position) {
    public BookResponseDTO(Book book){
        this(book.getId(), book.getTitle(), book.getImage(), book.getLink(), book.getPosition());
    }
}
