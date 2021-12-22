package exercicio.um.list;

/*
* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
*
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<InfoTemperatura> infoTemperatura = new ArrayList<InfoTemperatura>();

        infoTemperatura.add(new InfoTemperatura(28d, "Janeiro"));
        infoTemperatura.add(new InfoTemperatura(30d, "Fevereiro"));
        infoTemperatura.add(new InfoTemperatura(26d, "Março"));
        infoTemperatura.add(new InfoTemperatura(22d, "Abril"));
        infoTemperatura.add(new InfoTemperatura(20d, "Maio"));
        infoTemperatura.add(new InfoTemperatura(18d, "Junho"));

        Iterator<InfoTemperatura> iterator = infoTemperatura.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next().getTemperatura();
        }
        Double mediaSemestral = soma/infoTemperatura.size();
        System.out.println("A média semestral das temperaturas: " + mediaSemestral);

        for(InfoTemperatura iterador : infoTemperatura) {
            if (iterador.getTemperatura() > mediaSemestral) {
                System.out.println(iterador);
            }
        }
    }

}

class InfoTemperatura {
    private Double temperatura;
    private String mes;

    public InfoTemperatura(Double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "[" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                ']';
    }
}
