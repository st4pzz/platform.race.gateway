package insper.store.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class GatewayResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Gateway!";
    }

    @GetMapping("/fallback")
    public ResponseEntity<String> fallback() {
        return ResponseEntity.ok("Serviço temporariamente indisponível. Tente novamente mais tarde.");
    }
}
