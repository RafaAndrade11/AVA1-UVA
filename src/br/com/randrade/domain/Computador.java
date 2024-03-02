package br.com.randrade.domain;

public class Computador {
    private String placaDeVideo;
    private String marcaMemoriaRam;
    private String placaMae;
    private String tamanhoHd;
    private String corGabinete;

    public Computador() {
    }

    public Computador(String placaDeVideo, String marcaMemoriaRam, String placaMae, String tamanhoHd, String corGabinete) {
        this.placaDeVideo = placaDeVideo;
        this.marcaMemoriaRam = marcaMemoriaRam;
        this.placaMae = placaMae;
        this.tamanhoHd = tamanhoHd;
        this.corGabinete = corGabinete;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getMarcaMemoriaRam() {
        return marcaMemoriaRam;
    }

    public void setMarcaMemoriaRam(String marcaMemoriaRam) {
        this.marcaMemoriaRam = marcaMemoriaRam;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getTamanhoHd() {
        return tamanhoHd;
    }

    public void setTamanhoHd(String tamanhoHd) {
        this.tamanhoHd = tamanhoHd;
    }

    public String getCorGabinete() {
        return corGabinete;
    }

    public void setCorGabinete(String corGabinete) {
        this.corGabinete = corGabinete;
    }

    @Override
    public String toString() {
        return  "PLACA DE VIDEO = " + placaDeVideo + "\n" +
                "MEMORIA RAM = " + marcaMemoriaRam + "\n" +
                "PLACA MÃE = " + placaMae + "\n" +
                "TAMANHO DO HD = " + tamanhoHd + "\n" +
                "COR DO GABINETE = " + corGabinete + "\n" +
                "**********************************************";
    }
}
