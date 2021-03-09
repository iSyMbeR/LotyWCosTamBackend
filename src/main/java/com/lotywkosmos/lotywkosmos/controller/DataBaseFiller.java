package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.*;
import com.lotywkosmos.lotywkosmos.service.*;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Random;

@RequiredArgsConstructor
@RestController
class DataBaseFiller {
    private final UserService userService;
    private final PlanetService planetService;
    private final PortService portService;
    private final PortLinkService portLinkService;
    private final FlightService flightService;
    private final OrderService orderService;
    private final OrderItemService orderItemService;

    //    private final PaymentService paymentService;
    public void fillYearsArray() {
        for (int i = 0; i < 100; i++) {
            years[i] = 1910 + i;
        }
    }

    char[] sexArray = {'M', 'K'};
    Boolean[] trueFalseArray = {true, false};
    int[] years = new int[100];
    int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    Random random = new Random();


    // JEZELI KTOS TO BEDZIE DODAWAŁ TO POLECAM DODAWAĆ W TEJ KOLEJNOSCI I CZEKAĆ AŻ BEDZIE KOMUNIKAT NA STRONIE ZE DODANO
    // NO I TRZEBA W BAZIE TABELE WSZYSTKIE DROPNĄĆ
    @GetMapping("createRandomUsers")
    public String createRandomUsers() {
        fillYearsArray();
        for (int i = 1; i < 101; i++) {

            //men
            if (i < 50)
                userService.addUser(User.builder()
                        .firstName("firstName" + i)
                        .lastName("lastName" + i)
                        .login("user" + i)
                        .password("password" + i)
                        .sex(sexArray[random.nextInt(2)])
                        .date_of_birth(LocalDate.of(years[random.nextInt(100)], months[random.nextInt(12)], days[random.nextInt(28)]))
                        .build());


            else {//women/
                userService.addUser(User.builder()
                        .firstName("firstName" + i)
                        .lastName("lastName" + i)
                        .login("user" + i)
                        .password("password" + i)
                        .sex(sexArray[random.nextInt(2)])
                        .date_of_birth(LocalDate.of(years[random.nextInt(100)], months[random.nextInt(12)], days[random.nextInt(28)]))
                        .build());
            }
        }
        return "added 100 new users";
    }

    @GetMapping("createRandomPlanets")
    public String createRandomPlanets() {
        for (int i = 1; i < 11; i++) {
            planetService.addPlanetToBase(Planet.builder()
                    .name("Planet nr " + i)
                    .distanceFromTheSun(100000000 + random.nextInt(100000000))
                    .description("This planet is round")
                    .build());
        }
        return "added 10 new Planets";
    }

    @GetMapping("createRandomPorts")
    public String createRandomPorts() {
        for (int i = 1; i < 31; i++) {
            portService.addPortToBase(Port.builder()
                    .name("port nr " + i)
                    .description("info port" + i)
                    .planet(planetService.getSinglePlanet(1 + random.nextInt(10)))
                    .build());
        }
        return "added 30 new Ports";
    }

    @GetMapping("createRandomPortLinks")
    public String createRandomPortLinks() {
        for (int i = 1; i < 10; i++) {
            portLinkService.addPortLinkToBase(PortLink.builder()
                    .StartingPort(portService.getSinglePort(1 + random.nextInt(5)))
                    .EndPort(portService.getSinglePort(5 + random.nextInt(4)))
                    .build());
        }
        return "added 9 new Port Links";
    }

    @GetMapping("createRandomFlights")
    public String createRandomFlights() {
        for (int i = 2021; i < 2031; i++) {
            flightService.addFlightToBase(Flight.builder()
                    .maxSize(10 + random.nextInt(15))
                    .start_date(LocalDate.of(i, months[random.nextInt(12)], days[random.nextInt(28)]))
                    .end_date(LocalDate.of(i + 1, months[random.nextInt(12)], days[random.nextInt(28)]))
                    .portLink(portLinkService.getSinglePort(1 + random.nextInt(9)))
                    .ticketPrice((double) (10000 + random.nextInt(154354)))
                    .build());
        }
        return "added 10 new flights";
    }

    @GetMapping("createRandomOrders")
    public String createRandomOrders() {
        for (int i = 1; i < 16; i++) {
            orderService.addOrderToBase(Order.builder()
                    .user(userService.getSingleUser(1 + random.nextInt(100)))
                    .status(trueFalseArray[random.nextInt(2)])
                    .build());
        }
        return "added 15 new orders";
    }

    @GetMapping("createRandomOrderItems")
    public String createRandomOrderItems() {
        for (int i = 1; i < 40; i++) {
            orderItemService.addOrderItemToBase(OrderItem.builder()
                    .idFlight(flightService.getSingleFlight(1 + random.nextInt(30)))
                    .idOrder(orderService.getSinglePost(1 + random.nextInt(15)))
                    .build());
        }
        return "added 15 new order items";
    }

//    @GetMapping("createRandomPayments")
//    public String createRandomPayments(){
//        for(int i=1; i<40; i++){
//            paymentService.addPaymentToBase(Payment.builder()
//                    .idOrder(orderService.getSinglePost(random.nextInt(15)))
//                    .build());
//        }
//        return "added 15 new payments";
//    }

}
