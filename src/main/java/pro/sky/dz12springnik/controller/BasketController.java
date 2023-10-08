package pro.sky.dz12springnik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.dz12springnik.service.BasketService;


import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.get();
    }
}
