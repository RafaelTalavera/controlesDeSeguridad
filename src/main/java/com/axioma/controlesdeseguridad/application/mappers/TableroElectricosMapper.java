package com.axioma.controlesdeseguridad.application.mappers;

import com.axioma.controlesdeseguridad.application.dto.TablerosElectricosDTO;
import com.axioma.controlesdeseguridad.domain.models.TablerosElectrico;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TableroElectricosMapper {
    TablerosElectricosDTO toDTO(TablerosElectrico tablerosElectrico);
    TablerosElectrico toEntity(TablerosElectricosDTO tablerosElectricosDTO);
}
