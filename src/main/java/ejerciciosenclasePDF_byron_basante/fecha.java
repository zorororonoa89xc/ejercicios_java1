package ejerciciosenclasePDF_byron_basante;

import java.time.LocalDate;

public class fecha {

    // Método que devuelve el próximo día
    public String proximoDia() {
        LocalDate hoy = LocalDate.now();
        LocalDate siguienteDia = hoy.plusDays(1);
        return "Próximo día: " + siguienteDia.getDayOfMonth();
    }

    // Método que devuelve el próximo mes
    public String proximoMes() {
        LocalDate hoy = LocalDate.now();
        LocalDate siguienteMes = hoy.plusMonths(1);
        return "Próximo mes: " + siguienteMes.getMonth();
    }

    // Método que devuelve el próximo año
    public String proximoAnio() {
        LocalDate hoy = LocalDate.now();
        LocalDate siguienteAnio = hoy.plusYears(1);
        return "Próximo año: " + siguienteAnio.getYear();
    }
}