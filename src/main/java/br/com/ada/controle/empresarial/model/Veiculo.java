package br.com.ada.controle.empresarial.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @Column(unique = true)
    private String placa;
    private String marca;
    private Long anoFabricacao;
    private Long anoModelo;
    private LocalDate dataCompra;
    private Boolean ipvaVencido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Long anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Long getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Long anoModelo) {
        this.anoModelo = anoModelo;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Boolean getIpvaVencido() {
        return ipvaVencido;
    }

    public void setIpvaVencido(Boolean ipvaVencido) {
        this.ipvaVencido = ipvaVencido;
    }
}
