package com.jadnobarbosa.ramengo.order;


import com.jadnobarbosa.ramengo.client.RVClient;
import com.jadnobarbosa.ramengo.order.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private RVClient client;

    @Value("${rv.api.key}")
    private String apiKey;

    public List<Broth> getBroths() {
        return client.getBroths(apiKey);
    }

    public List<Protein> getProteins() {
        return client.getProteins(apiKey);
    }

    public OrderResponse postOrder(OrderRequest request) {
        String brothId = request.getBrothId();
        String proteinId = request.getProteinId();

        Optional<Broth> broth = client.getBroths(apiKey).stream().filter(b -> b.getId().equals(brothId)).findFirst();
        Optional<Protein> protein = client.getProteins(apiKey).stream().filter(p -> p.getId().equals(proteinId)).findFirst();

        if(broth.isEmpty() || protein.isEmpty()) {
            throw new IllegalArgumentException("both brothId and proteinId are required");
        }

        OrderResponse response = new OrderResponse();
        response.setId(client.generateId(apiKey).getOrderId());
        response.setDescription(broth.get().getName() + " and " + protein.get().getName() + " Ramen");
        response.setImage("https://tech.redventures.com.br/icons/ramen/ramen" + protein.get().getName() + ".png");

        return response;
    }

}
