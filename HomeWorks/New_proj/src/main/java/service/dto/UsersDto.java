package service.dto;

import lombok.Builder;
import lombok.Data;
import service.models.User;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UsersDto {
    String name;
    String surname;
    List<HotelDto>  hotels;
}