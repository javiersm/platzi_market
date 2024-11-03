package com.platzi.platzi_market.persistence.crud;

import com.platzi.platzi_market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) // Otra opcion para hacer la consulta haciendo directamente la query
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
