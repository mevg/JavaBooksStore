package mevg.weCode.bookStore.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mevg.weCode.bookStore.dtos.BookDto;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        var book =  new BookDto();
        book.setTitle("my First Book");

        var books = new ArrayList<BookDto>();
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
