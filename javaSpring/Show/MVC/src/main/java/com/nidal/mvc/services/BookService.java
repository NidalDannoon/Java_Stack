package com.nidal.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nidal.mvc.models.Book;
import com.nidal.mvc.repositories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
 // update a book
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional <Book> update = bookRepository.findById(id);
    	if(update != null) {
    		update.get().setTitle(title);
    		update.get().setDescription(desc);
    		update.get().setLanguage(lang);
    		update.get().setNumberOfPages(numOfPages);

    		return update.get();
    	}
    	return null;        
    }
    
 // delete a book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
