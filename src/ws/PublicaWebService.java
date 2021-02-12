package ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {
	public static void main(String[] args) {
		
		EstoqueWS ws = new EstoqueWS();
		
		String url = "http://localhost:8080/estoquews";
		
		Endpoint.publish(url, ws);
		
		//  http://localhost:8080/estoquews?wsdl
		
		System.out.println("Webservice rodando");
	}
}

//@Oneway //Anotação para endpoint assíncrono 
//@WebMethod(operationName="GerarRelatorio")
//public void gerarRelatorio() { 
//  // código omitido
//}

//public class TesteItemParaXML {
//
//  public static void main(String[] args) throws JAXBException {
//      Item item = new Item.Builder().comCodigo("MEA").comNome("MEAN").comQuantidade(4).comTipo("Livro").build();
//
//      JAXBContext context = JAXBContext.newInstance(Item.class);
//      Marshaller marshaller = context.createMarshaller();
//      marshaller.marshal(item, new File("item.xml")); //ou marshaller.marshal(item, System.out);        
//  }
//
//}

//wsimport e wsdl2java são ferramentas de linha de comando para gerar as classes Java a partir do WSDL.