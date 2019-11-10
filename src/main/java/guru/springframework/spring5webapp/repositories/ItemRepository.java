package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {

    public Item findBySwiftCode(String swiftCode);
}
