package service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.forms.HotelForm;
import service.models.Hotel;
//import service.repositories.UsersRepository;
import service.dto.HotelDto;

import java.util.ArrayList;
import java.util.List;


import service.repositories.HotelRepository;

@Component
public class HotelsServiceImpl implements HotelsService {

    @Autowired
    private HotelRepository hotelRepository;



    /*public List<HotelDto> getAllHotelsDump() {
        List<Нotel> hotel = hotelsRepository.findAll();

        List<HotelDto> hotelDtos = new ArrayList<HotelDto>();
        for (Hotel hot : hotels) {
            hot.add(HotelDto.builder()

                    .hot(hotel.getName())
                    .condition (hotel.getName())
                    .build());
        }
        return hotelDtos;*/


    //Добавляю гостиницу

   public List<String> getAllHotels(){
        List<Hotel> hotels=hotelRepository.findAll();

        List<String> hot = new ArrayList<String>();
        for (Hotel hotel : hotels) {
           hot.add(hotel.getHotelname());
           /*hotelname.add(hotel.getCondition());*/

        }


        return hot;
    }





}