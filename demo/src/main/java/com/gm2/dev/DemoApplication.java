package com.gm2.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplication {
	
	/*variavel local privada da Classe ApppConfiguration, sendo instanciada pela variavel "appconfiguration"*/
	@Autowired
	private AppConfiguration appconfiguration;
	
	/*Esta anotation referencia um variavel
	 * neste exemplo, esta sendo vinculado ao arquivo application.properties
	 * */
	@Value("${app.message}")
	private String message;
	
	
	/*Construtor, carrega a clase AppConfiguration, sendo instanciada pela variavel "appconfiguration"
	@Autowired
	public DemoApplication(AppConfiguration appconfiguration) {
		this.appconfiguration = appconfiguration;
	}
	*/
	

	
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
     
    }

    @GetMapping("/inicio2")
    public String inicio() {
        //return "Hello Word - aplicacao em java spring boot";
    	return message;
    }
    
    /*Visto que a variavel, private appconfiguration, instancia a classe AppConfiguration, entao seu metodos podem ser acessados*/
    @GetMapping("/configuration")
    public String config() {
    	return appconfiguration.getMessage();
    }
    
    @GetMapping("/calculo001")
    public Integer resultado() {
    	return appconfiguration.getCalc(10, 966);
    }
    
    /*Para passa o parametro na url, siga esta instrucao exemplo:
     * http://localhost:8089/hello?name=Douglas
     * */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return String.format("Hello %s!", name);
    }
    
    /*
     * Criar aqui um metodo que recebe calculo de parametros na url
     * */
    
    
    


}
