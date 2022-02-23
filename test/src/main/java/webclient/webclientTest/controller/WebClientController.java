package webclient.webclientTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {

    @GetMapping("/test")
    public Mono<String> doTest(){
        WebClient client = WebClient.create();
        return client.get()
                .uri("http://localhost:1111/webclient/test-create")
                .retrieve()
                .bodyToMono(String.class);
    }
}
