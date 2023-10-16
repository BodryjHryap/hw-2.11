package pro.sky.skyprospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

    private CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping("/addition")
    public String addition(@RequestParam int n1, @RequestParam int n2) {
        return calcService.addition(n1, n2);
    }

    @GetMapping("/subtraction")
    public String subtraction(@RequestParam int n1, @RequestParam int n2) {
        return calcService.subtraction(n1, n2);
    }

    @GetMapping("/multiplication")
    public String multiplication(@RequestParam int n1, @RequestParam int n2) {
        return calcService.multiplication(n1, n2);
    }

    @GetMapping("/division")
    public String division(@RequestParam int n1, @RequestParam int n2) {
        return calcService.division(n1, n2);
    }
}
