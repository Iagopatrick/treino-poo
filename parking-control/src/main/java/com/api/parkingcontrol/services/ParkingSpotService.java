package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
/*  Criar uma interface, de forma que essa classe implemente a interface -> Isso ajuda na manuntenção
-> Camada intermediaria entre o controler e o repository
*/
public class ParkingSpotService {
   
   final ParkingSpotRepository parkingSpotRepository;
   public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
    this.parkingSpotRepository = parkingSpotRepository;
   }
    
}
