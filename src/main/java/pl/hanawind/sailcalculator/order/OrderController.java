package pl.hanawind.sailcalculator.order;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/neworder")
    public String newOrder(Model model){
        model.addAttribute("order", new Order());
        return "order-send";
    }

    @PostMapping("/addorder")
    public String addOrder(BindingResult result, Order order){
        if (result.hasErrors()){
            return "redirect:/neworder";
        }

        orderService.addOrder(order);
        return "redirect:/user-dashboard";
    }
}
