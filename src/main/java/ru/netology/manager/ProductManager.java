package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.domain.Book;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductManager() {
    }

    public void add(Product item) {
        repository.save(item);
    }

    public Product[] getAll() {
        Product[] result = repository.findAll();
        return result;
    }

    public void removeById(int id) {
        if (repository.findById(id) == null) {
            System.out.println("Element with id: " + id + " not found");
            throw new Book.NotFoundException(id);
        }
        repository.removeById(id);
        System.out.println("manager done"); // for demo only
    }
}







