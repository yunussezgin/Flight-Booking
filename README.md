## Flight Booking

#### Service Postman Collection: https://www.getpostman.com/collections/82058ae5aacb40eae707

Yukarıdaki link ile Postman'a resquest ve response import edilebilir.

### Postman
![image](https://github.com/yunussezgin/flight-booking/blob/master/src/main/resources/postman_collections.JPG?raw=true)

#### Postman Request Detayları:
1. airlinecompanies_create -> Havayolu şirketi ekler.
2. airlinecompanies_retrieveAllAirlineCompanies -> Havayolu sorgular.
3. airports_create -> Havaalanı ekler.
4. airports_retrieveAllAirports -> Havaalanı sorgular.
5. airlineroutes_create -> Rota ekler.
6. airlineroutes_retrieveAllAirlineRoutes -> Rota sorgular.
7. flights_create -> Havayolu şirketine uçuş tanımlar.
8. flights_retrieveAllFlights -> Tüm uçuşları sorgular.
9. flights_retrieveFlightsByAirlineCompany -> Uçuşları havayolu şirketine göre filtreler.


Technologies: Java 8 and Spring Boot 2.3.5


### Test Data (H2 Database uygulama başladığında data.sql dosyasındaki data ile dolar.)
![image](https://github.com/yunussezgin/flight-booking/blob/master/src/main/resources/flight_booking_data.JPG?raw=true)


