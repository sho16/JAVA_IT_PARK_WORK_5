package service.services;

import service.dto.HotelDto;
import service.forms.UserForm;

import java.util.List;

public interface HotelsService {


  List<String> getAllHotels();
  List<HotelDto>  getAllHotelsDump();

}