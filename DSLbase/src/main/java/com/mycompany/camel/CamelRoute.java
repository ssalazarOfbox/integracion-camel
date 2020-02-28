package com.mycompany.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.company.model.Transporte;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:programa")
		.process( new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				// data prueba
				Transporte t = new Transporte();
				t.setDescripcion("entrega");
				t.setId_transporte(1l);
				t.setMillas(0l);	
				exchange.getIn().setBody(t);
			}
		})
		.to("sql:INSERT INTO transporte(descripcion,millas,id_paquete) values ( :#${body.descripcion}, :#{body.millas},  :#${body.id_transporte})?dataSource=#datasource");
			
	}

}




