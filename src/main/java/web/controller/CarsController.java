package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = (count != null) ? carService.getCars(count) : carService.getCars();
        model.addAttribute("cars", cars);

        return "cars";
    }
}
