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



    public List<HotelDto> getAllHotelsDump() {
        List<Hotel> hotel_all = hotelRepository.findAll();

        List<HotelDto> hotelDtos = new ArrayList<>();
        for (Hotel hot1 : hotel_all) {
            hotelDtos.add(HotelDto.builder()

                    .name(hot1.getHotelname())
                    .standart(hot1.getStandart())
                    .choice(hot1.getYourchoice())
                    .hotelprice(hot1.getPrice())
                    .capacity(hot1.getCapacity())
                    .build());
        }
        return hotelDtos;
    }

    //Добавляю гостиницу

   public List<String> getAllHotels(){
        List<Hotel> hotels=hotelRepository.findAll();

        List<String> hot = new ArrayList<String>();
        for (Hotel hotel : hotels) {
           hot.add(hotel.getHotelname());
          // hot.add(hotel.getCondition());

        }


        return hot;
    }




}