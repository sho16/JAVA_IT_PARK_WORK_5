package service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import service.models.Hotel;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Builder
public class HotelDto {
    private String name;
    private String standart;
    private Integer hotelprice;
    private String choice;
    private  String capacity;
    private String checkname;

    public static HotelDto from(Hotel model) {
        return HotelDto.builder().name(model.getHotelname()).build();
    }

    public static List<HotelDto> from(List<Hotel> models) {
       return models.stream().map(HotelDto::from).collect(Collectors.toList());

    }
}
