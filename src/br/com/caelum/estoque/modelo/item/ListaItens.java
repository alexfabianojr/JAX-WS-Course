package br.com.caelum.estoque.modelo.item;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//a tarefa desta classe é embrulha a lista de item no xml
//<itens><item></item></itens>
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItens {

	@XmlElement(name = "item") //dando nome aos elementos da lista no xml
	private List<Item> itens;

	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	ListaItens() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}
