package umg.edu.demo.repository;

import umg.edu.demo.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long> {}