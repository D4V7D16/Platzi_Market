package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "categoryName"),
        @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);
/*
    //De esta manera le decimos a Mapper que realizamos la misma conversión pero a la inversa
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true) //De esta manera le decimos al Mapper que ignoramos algún campo de la entity
    Categoria toCategoria(Category category);
*/
}
