package sesion4.core.domain;

import sesion4.core.driven_ports.BookRepository;
import sesion4.core.driver_ports.BookService;

public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}
}
