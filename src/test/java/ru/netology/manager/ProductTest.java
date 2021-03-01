package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.TShirt;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Product book1 = new Book(1, "Book1", 50, "Smith");
    private Product book2 = new Book(2, "book2", 100, "Ivanov");
    private Product tshirt1 = new TShirt(3, "orange", 35, "Adidas");
    private Product tshirt2 = new TShirt(4, "with books", 40, "Nike");


    @BeforeEach
    public void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(tshirt1);
        manager.add(tshirt2);
    }

    @Test
    void removeByExistId() {
        manager.removeById(1);
        Product[] actual = manager.getAll();
        Product[] expected = new Product[]{book2, tshirt1, tshirt2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByNonExistId() {
        assertThrows(NotFoundException.class, () -> manager.removeById(5));
    }
}