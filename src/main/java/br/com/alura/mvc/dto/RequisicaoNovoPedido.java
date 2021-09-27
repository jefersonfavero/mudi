package br.com.alura.mvc.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.model.Pedido;

public class RequisicaoNovoPedido {
	@NotBlank(message = "Precisa de um nome")
	@Min(1)
	public String nomeProduto;
	@NotBlank(message = "Precisa de uma url de produto")
	public String urlProduto;
	@NotBlank(message = "Precisa de uma url de imagem")
	public String urlImagem;
	@NotBlank(message = "Precisa de uma descrição")
	public String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}
	
	
}
