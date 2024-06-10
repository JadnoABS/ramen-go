package com.jadnobarbosa.ramengo.order;


import com.jadnobarbosa.ramengo.order.dto.Broth;
import com.jadnobarbosa.ramengo.order.dto.Ingredient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {


    public List<Broth> getBroths() {
        List<Broth> list = new ArrayList<>();
        Broth salt = Broth.builder()
                .id(1)
                .imageInactive("https://tech.redventures.com.br/icons/salt/inactive.svg")
                .imageActive("https://tech.redventures.com.br/icons/salt/active.svg")
                .name("Salt")
                .description("Simple like the seawater, nothing more")
                .price(new BigDecimal(10))
                .build();
        list.add(salt);

        return list;
    }


}
