package pe.edu.cibertec.sw_async_hilos.remote.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class TaskService {

    public String operacionPagoOnline(){
        try{
            log.info("Iniciando proceso de pago.");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Pago Exitoso";
    }

    public String operacionRegistroVentas(){
        try{
            log.info("Inicio registro de ventas.");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Registro de venta exitoso";
    }

    public String operacionActualizacionCompras(){
        try{
            log.info("Actualización de compras.");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return  "Actualización de compra exitosa.";
    }
}
