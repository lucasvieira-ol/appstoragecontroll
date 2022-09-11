package com.appstoragecontroll.storagecontroll.adapter.input.rest;

import com.appstoragecontroll.core.domain.request.TestRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @PostMapping("/first_controller")
  public String firstControllerMethod(@RequestBody TestRequest request) {
    Double delta =
      Math.pow(2, request.getB()) - 4 * request.getA() * request.getC();
    if (delta < 0.0) return "Delta Negativo";

    double x1 = (-request.getB() + Math.sqrt(delta)) / 2 * request.getA();
    double x2 = (-request.getB() - Math.sqrt(delta)) / 2 * request.getA();

    return (
      "Os resultados de X1 e X2 são, respectivamente: " + x1 + " e " + x2
    );
  }

  @GetMapping("/test")
  public String test() {
    return "Olaaaaaaaa";
  }
}
