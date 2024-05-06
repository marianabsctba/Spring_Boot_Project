package br.infnet.edu.mbs.tp1_calc.controller;

import br.infnet.edu.mbs.tp1_calc.model.CalculationRequest;
import br.infnet.edu.mbs.tp1_calc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    // GET and POST for Addition
    @GetMapping("/add")
    public double add(@RequestParam double operand1, @RequestParam double operand2) {
        return calculatorService.add(operand1, operand2);
    }

    @PostMapping("/add")
    public double addPost(@RequestBody CalculationRequest request) {
        return calculatorService.add(request.getOperand1(), request.getOperand2());
    }

    // GET and POST for Subtraction
    @GetMapping("/subtract")
    public double subtract(@RequestParam double operand1, @RequestParam double operand2) {
        return calculatorService.subtract(operand1, operand2);
    }

    @PostMapping("/subtract")
    public double subtractPost(@RequestBody CalculationRequest request) {
        return calculatorService.subtract(request.getOperand1(), request.getOperand2());
    }

    // GET and POST for Multiplication
    @GetMapping("/multiply")
    public double multiply(@RequestParam double operand1, @RequestParam double operand2) {
        return calculatorService.multiply(operand1, operand2);
    }

    @PostMapping("/multiply")
    public double multiplyPost(@RequestBody CalculationRequest request) {
        return calculatorService.multiply(request.getOperand1(), request.getOperand2());
    }

    // GET and POST for Division
    @GetMapping("/divide")
    public double divide(@RequestParam double operand1, @RequestParam double operand2) {
        return calculatorService.divide(operand1, operand2);
    }

    @PostMapping("/divide")
    public double dividePost(@RequestBody CalculationRequest request) {
        return calculatorService.divide(request.getOperand1(), request.getOperand2());
    }

    // GET and POST for Exponentiation
    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return calculatorService.power(base, exponent);
    }

    @PostMapping("/power")
    public double powerPost(@RequestBody CalculationRequest request) {
        return calculatorService.power(request.getOperand1(), request.getOperand2());
    }
}

