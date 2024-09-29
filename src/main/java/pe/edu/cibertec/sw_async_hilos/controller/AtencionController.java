package pe.edu.cibertec.sw_async_hilos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.sw_async_hilos.service.AtencionService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@RestController
public class AtencionController {
    private final AtencionService atencionService;

    @GetMapping("/finalizar-venta")
    public String atencionVenta() throws ExecutionException,
            InterruptedException {
        CompletableFuture<String> resultado =
                atencionService.ejecutarTareasAsincronas();
        return resultado.get();
    }

    @GetMapping("/finalizar-venta-sync")
    public String atencionVentaSync() {
        return atencionService.ejecutarTareas();
    }

}
