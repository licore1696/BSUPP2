import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    private FibonacciFacade fibonacciFacade;

    public FibonacciController() {
        this.fibonacciFacade = new FibonacciFacade();
    }

    @GetMapping("/{n}")
    public ResponseEntity<Integer> getNthFibonacciNumber(@PathVariable int n) {
        int result = fibonacciFacade.getNthFibonacciNumber(n);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/series/{n}")
    public ResponseEntity<int[]> getFirstNFibonacciNumbers(@PathVariable int n) {
        int[] result = fibonacciFacade.getFirstNFibonacciNumbers(n);
        return ResponseEntity.ok(result);
    }
}