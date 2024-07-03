package com.luiz_melo;

public class EscolhaUF {
    String estadosBrasileiros[] = {"Acre", "Alagoas", "Amapá", "Amazonas",
            "Bahia", "Ceará", "Distrito Federal", "Espirito Santo",
            "Goiás", "Maranhão", "Mato Grosso do Sul", "Mato Grosso",
            "Minas Gerais", "Pará", "Paraíba", "Paraná",
            "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte",
            "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
            "São Paulo", "Sergipe", "Tocantins"};
    public void impressaoEstadosBrasileiros(){
        System.out.print("Opções de estado do endereço do Cliente: ");
        for (int i =0; i<estadosBrasileiros.length; i++){
            System.out.println((i+1) +" - " + estadosBrasileiros[i]);
        }

    }

    public String retornarEstado(int opcaoEstado){
        String estadoCliente = null;
        switch (opcaoEstado){
            case 1:
                UF UF1 = UF.ACRE;
                estadoCliente = String.valueOf(UF1.sigla());
                break;
            case 2:
                UF UF2 = UF.ALAGOAS;
                estadoCliente = String.valueOf(UF2.sigla());
                break;
            case 3:
                UF UF3 = UF.AMAPA;
                estadoCliente = String.valueOf(UF3.sigla());
                break;
            case 4:
                UF UF4 = UF.AMAZONAS;
                estadoCliente = String.valueOf(UF4.sigla());
                break;
            case 5:
                UF UF5 = UF.BAHIA;
                estadoCliente = String.valueOf(UF5.sigla());
                break;
            case 6:
                UF UF6 = UF.CEARA;
                estadoCliente = String.valueOf(UF6.sigla());
                break;
            case 7:
                UF UF7 = UF.DISTRITO_FEDERAL;
                estadoCliente = String.valueOf(UF7.sigla());
                break;
            case 8:
                UF UF8 = UF.ESPIRITO_SANTO;
                estadoCliente = String.valueOf(UF8.sigla());
                break;
            case 9:
                UF UF9 = UF.GOIAS;
                estadoCliente = String.valueOf(UF9.sigla());
                break;
            case 10:
                UF UF10 = UF.MARANHAO;
                estadoCliente = String.valueOf(UF10.sigla());
                break;
            case 11:
                UF UF11 = UF.MATO_GROSSO;
                estadoCliente = String.valueOf(UF11.sigla());
                break;
            case 12:
                UF UF12 = UF.MATO_GROSSO_DO_SUL;
                estadoCliente = String.valueOf(UF12.sigla());
                break;
            case 13:
                UF UF13 = UF.MINAS_GERAIS;
                estadoCliente = String.valueOf(UF13.sigla());
                break;
            case 14:
                UF UF14 = UF.PARA;
                estadoCliente = String.valueOf(UF14.sigla());
                break;
            case 15:
                UF UF15 = UF.PARAIBA;
                estadoCliente = String.valueOf(UF15.sigla());
                break;
            case 16:
                UF UF16 = UF.PARANA;
                estadoCliente = String.valueOf(UF16.sigla());
                break;
            case 17:
                UF UF17 = UF.PERNAMBUCO;
                estadoCliente = String.valueOf(UF17.sigla());
                break;
            case 18:
                UF UF18 = UF.PIAUI;
                estadoCliente = String.valueOf(UF18.sigla());
                break;
            case 19:
                UF UF19 = UF.RIO_DE_JANEIRO;
                estadoCliente = String.valueOf(UF19.sigla());
                break;
            case 20:
                UF UF20 = UF.RIO_GRANDE_DO_NORTE;
                estadoCliente = String.valueOf(UF20.sigla());
                break;
            case 21:
                UF UF21 = UF.RIO_GRANDE_DO_SUL;
                estadoCliente = String.valueOf(UF21.sigla());
                break;
            case 22:
                UF UF22 = UF.RONDONIA;
                estadoCliente = String.valueOf(UF22.sigla());
                break;
            case 23:
                UF UF23 = UF.RORAIMA;
                estadoCliente = String.valueOf(UF23.sigla());
                break;
            case 24:
                UF UF24 = UF.SANTA_CATARINA;
                estadoCliente = String.valueOf(UF24.sigla());
                break;
            case 25:
                UF UF25 = UF.SAO_PAULO;
                estadoCliente = String.valueOf(UF25.sigla());
                break;
            case 26:
                UF UF26 = UF.SERGIPE;
                estadoCliente = String.valueOf(UF26.sigla());
                break;
            case 27:
                UF UF27 = UF.TOCANTINS;
                estadoCliente = String.valueOf(UF27.sigla());
                break;
        }
        return estadoCliente;
    }
}
