package service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TempController {
    @GetMapping("/entitites/{entity-id}")
    public ResponseEntity<SomeDto> getSomeEntity(@PathVariable("entity-id") Long entityId) {
        return ...
    }
}
