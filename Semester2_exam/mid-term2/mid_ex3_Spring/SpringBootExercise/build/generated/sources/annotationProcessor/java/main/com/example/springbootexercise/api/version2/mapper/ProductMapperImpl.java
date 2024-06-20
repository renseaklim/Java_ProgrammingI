package com.example.springbootexercise.api.version2.mapper;

import com.example.springbootexercise.api.version2.dto.CreateProductDto;
import com.example.springbootexercise.api.version2.dto.ProductDto;
import com.example.springbootexercise.api.version2.dto.UpdateProductDto;
import com.example.springbootexercise.api.version2.entities.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-20T00:33:20+0700",
    comments = "version: 1.6.0.Beta1, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product fromProductDto(CreateProductDto createProductDto) {
        if ( createProductDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( createProductDto.name() );
        product.setPrice( createProductDto.price() );
        product.setActiveForSell( createProductDto.activeForSell() );

        return product;
    }

    @Override
    public ProductDto toProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        BigDecimal price = null;
        Boolean activeForSell = null;

        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        activeForSell = product.getActiveForSell();

        ProductDto productDto = new ProductDto( id, name, price, activeForSell );

        return productDto;
    }

    @Override
    public List<ProductDto> toProductDtoList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( toProductDto( product ) );
        }

        return list;
    }

    @Override
    public void fromUpdateProductDto(Product product, UpdateProductDto updateProductDto) {
        if ( updateProductDto == null ) {
            return;
        }

        product.setName( updateProductDto.name() );
        product.setPrice( updateProductDto.price() );
        product.setActiveForSell( updateProductDto.activeForSell() );
    }
}
