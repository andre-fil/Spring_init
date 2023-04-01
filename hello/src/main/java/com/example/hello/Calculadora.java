package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.bytecode.stackmap.BasicBlock.Catch;

@RestController
@RequestMapping("calc/")
public class Calculadora {

  @GetMapping("soma/{num1}/{num2}")
  public Double soma(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
    return num1 + num2;

  }

  @GetMapping("subtracao/{num1}/{num2}")
  public Double subtracao(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
    return num1 - num2;

  }

  @GetMapping("multiplicacao/{num1}/{num2}")
  public Double multiplicacao(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
    return num1 * num2;

  }

  @GetMapping("divisao/{num1}/{num2}")
  public Double divisao(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
    try{
        if (num2 != 0){
            return num1/num2;
        } else{
            return null;
        }
    }
    
    catch(ArithmeticException e){
        return null;
    }
}
    


}

