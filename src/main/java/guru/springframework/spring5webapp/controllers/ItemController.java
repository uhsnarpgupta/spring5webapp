package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.ItemRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class ItemController {

    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/items")
    public String getItems(Model model){

        model.addAttribute("items", itemRepository.findAll());

        return "items";
    }

    @RequestMapping("/item")
    public String getItem(Model model, @Param("swiftCode") String swiftCode){

        model.addAttribute("items", itemRepository.findBySwiftCode(swiftCode));

        return "items";
    }


}
