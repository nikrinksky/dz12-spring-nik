package pro.sky.dz12springnik.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    public List<Integer> items = new ArrayList<>();

    @Override
    public List<Integer> add(List<Integer> id) {
        items.addAll(id);
        return id;
    }

    @Override
    public List<Integer> get() {
        return items;
    }
}
