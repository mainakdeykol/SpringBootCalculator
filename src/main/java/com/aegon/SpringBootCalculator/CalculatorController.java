package com.aegon.SpringBootCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("result/{oparation}/{num1}/{num2}")
    public String result(@PathVariable String oparation,@PathVariable int num1,@PathVariable int num2){
        if(oparation.equals("add")){
            return "Addition is "+ (num1+num2);
        }
        else if(oparation.equals("subtract")){
            return "Subtraction is "+ (num1-num2);
        }
        else if(oparation.equals("multiply")){
            return "Multiplication is "+ (num1*num2);
        }
        else if(oparation.equals("divide")){
            return "Division is "+ (num1/num2);
        }
        return "Bad Oparator";
    }

}
