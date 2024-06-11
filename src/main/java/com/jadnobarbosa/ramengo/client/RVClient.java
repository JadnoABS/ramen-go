package com.jadnobarbosa.ramengo.client;

import com.jadnobarbosa.ramengo.client.dto.GenerateIdResponse;
import com.jadnobarbosa.ramengo.order.dto.Broth;
import com.jadnobarbosa.ramengo.order.dto.Protein;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "rvclient", url = "${rv.api.url}")
public interface RVClient {

    @GetMapping("/broths")
    List<Broth> getBroths(@RequestHeader("x-api-key") String key);

    @GetMapping("/proteins")
    List<Protein> getProteins(@RequestHeader("x-api-key") String key);

    @PostMapping("/orders/generate-id")
    GenerateIdResponse generateId(@RequestHeader("x-api-key") String key);
}
