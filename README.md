## Flight Booking

Technologies: Java 8 and Spring Boot 2.3.5

#### Service Postman Collection: https://www.getpostman.com/collections/82058ae5aacb40eae707

Yukarıdaki link ile Postman'a resquest ve response import edilebilir.

### Postman
![image](https://github.com/yunussezgin/flight-booking/blob/master/src/main/resources/postman_collections.JPG?raw=true)

#### Postman Request Detayları:
1. airlinecompanies_create -> Havayolu şirketi ekler.
2. airlinecompanies_retrieveAllAirlineCompanies -> Havayolu şirketi sorgular.
3. airlinecompanies_retrieveAirlineCompanyByName -> Şirket ismine göre havayolu şirketi sorgular.
4. airports_create -> Havaalanı ekler.
5. airports_retrieveAllAirports -> Havaalanı sorgular.
6. airports_retrieveAirportByLocation -> Havaalanı ismine göre havaalanı sorgular.
7. airlineroutes_create -> Rota ekler.
8. airlineroutes_retrieveAllAirlineRoutes -> Rota sorgular.
9. airlineroutes_retrieveAirlineRoutesByToAirport -> Gidilecek havalanına göre rotaları filtreler.
10. airlineroute_retrieveAirlineRoutesByAirlineCompany -> Havayolu şirketine göre rotaları filtreler.
11. flights_create -> Havayolu şirketine uçuş tanımlar.
12. flights_retrieveAllFlights -> Tüm uçuşları sorgular.
13. flights_retrieveFlightsByAirlineCompany -> Uçuşları havayolu şirketine göre filtreler.
14. tickets_create -> Bilet satışını sağlar. Kredi kartını maskeler.
15. tickets_retrieveAllTickets -> Tüm biletleri sorgular.
16. tickets_retrieveTicketByNumber -> Bilet numarasına göre sorgulama yapar.



### Test Data (H2 Database uygulama başladığında data.sql dosyasındaki data ile dolar.)
![image](https://github.com/yunussezgin/flight-booking/blob/master/src/main/resources/flight_booking_data.JPG?raw=true)


