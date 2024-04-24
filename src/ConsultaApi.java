import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaApi {

    public double convertirMoneda(String monedaBase, String monedaDestino) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/bf8c058c1c451d9548c46384/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);

            // Obtener la tasa de conversión para la moneda de destino
            Map<String, Double> conversionRates = moneda.getConversion_rates();
            Double tasaConversion = conversionRates.get(monedaDestino);

            if (tasaConversion != null) {
                return tasaConversion;
            } else {
                throw new RuntimeException("Tasa de conversión no encontrada para la moneda de destino");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tasa de conversión");
        }
    }
}


