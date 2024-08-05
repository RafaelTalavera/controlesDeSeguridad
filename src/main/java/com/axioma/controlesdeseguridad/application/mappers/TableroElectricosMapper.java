package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.TablerosElectricosDTO;
import com.axioma.controlesdeseguridad.domain.models.TablerosElectrico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TableroElectricosMapper {

    TableroElectricosMapper INSTANCE = Mappers.getMapper(TableroElectricosMapper.class);

    TablerosElectricosDTO toDTO(TablerosElectrico tablerosElectrico);
    TablerosElectrico toEntity(TablerosElectricosDTO tablerosElectricosDTO);
}
